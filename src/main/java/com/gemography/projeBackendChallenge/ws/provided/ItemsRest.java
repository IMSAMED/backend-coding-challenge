package com.gemography.projeBackendChallenge.ws.provided;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gemography.projeBackendChallenge.service.facade.ItemsService;

@RestController
@RequestMapping("trendingRepos")
public class ItemsRest {
	
	@Autowired
	private ItemsService itemsService;

	@GetMapping ("/")
	public Map<String, Long> listTrendingReposByLanguage() {
		return itemsService.listTrendingReposByLanguage();
	}

	
	
	
}
