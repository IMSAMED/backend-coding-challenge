package com.gemography.projeBackendChallenge.ws.required;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.gemography.projeBackendChallenge.bean.TrendingRepos;


 
@FeignClient(value="github" , url="https://api.github.com")

public interface GithubClient {
	
	@GetMapping("/search/repositories?q=created:>2020-01-30&sort=stars&order=desc")
	TrendingRepos githubApiResponse() ;
    
	
	
}
