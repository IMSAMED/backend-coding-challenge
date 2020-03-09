package com.gemography.projeBackendChallenge.service.facade;

import java.util.Map;
import java.util.Set;

public interface ItemsService {

	
   public Map<String, Long> trendingReposNumberByLanguage();

   public Map<String,Set<String>> trendingReposNameByLanguage();
	
	
}
