package com.gemography.projeBackendChallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.gemography.projeBackendChallenge")
public class BackendCodingChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendCodingChallengeApplication.class, args);
	}

}
