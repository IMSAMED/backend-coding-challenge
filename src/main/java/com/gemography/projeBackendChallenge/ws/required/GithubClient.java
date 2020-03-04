package com.gemography.projeBackendChallenge.ws.required;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.gemography.projeBackendChallenge.bean.TrendingRepos;



// dir date b39ELHA  
@FeignClient(value="github" , url="https://api.github.com/search/repositories?q=created:>2020-01-30&sort=stars&order=desc")

public interface GithubClient {
	
	@GetMapping
	TrendingRepos githubApiResponse();

	
	
}
