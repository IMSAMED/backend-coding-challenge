package com.gemography.projeBackendChallenge.service.impl;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gemography.projeBackendChallenge.bean.Items;
import com.gemography.projeBackendChallenge.service.facade.ItemsService;
import com.gemography.projeBackendChallenge.ws.required.GithubClient;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private GithubClient githubClient;

	@Override
	public Map<String, Long> trendingReposNumberByLanguage() {
		Items[] trendingReposItems = githubClient.githubApiResponse().getItems();

		return Arrays.asList(trendingReposItems).stream().filter(i -> i.getLanguage() != null && !i.isPrivateRepo())
				.collect(Collectors.groupingBy(Items::getLanguage, Collectors.counting()));
	}

	@Override
	public Map<String, Set<String>> trendingReposNameByLanguage() {
		Items[] trendingReposItems = githubClient.githubApiResponse().getItems();

		return Arrays.asList(trendingReposItems).stream().filter(i -> i.getLanguage() != null && !i.isPrivateRepo())
				.collect(Collectors.groupingBy(Items::getLanguage,
						Collectors.mapping(Items::getFull_name, Collectors.toSet())));
	}

}
