package com.gemography.projeBackendChallenge.ws.provided;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gemography.projeBackendChallenge.service.facade.ItemsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api( description=" list the languages used by the 100 trending public repos on GitHub.\r\n" + "")
@RestController
@RequestMapping("trendingRepos")
public class ItemsRest {
	
	@Autowired
	private ItemsService itemsService;

	@ApiOperation(value = "the list of repos using the language")
	@GetMapping ("/repoNameBylanguage")
	public Map<String, Set<String>> trendingReposNameByLanguage() {
		return itemsService.trendingReposNameByLanguage();
	}


	@ApiOperation(value = "calculate Number of repos using the language")
	@GetMapping ("/")
	public Map<String, Long> trendingReposNumberByLanguage() {
		return itemsService.trendingReposNumberByLanguage();
	}

	
	
	
}
