package com.example.configTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class CloudConfigClientApplication {

	/*@Value("${test-url}")
	private String url;
	*/@Bean
	public RestTemplate getRest() {
		return new RestTemplate();
	}
	@Autowired
	RestTemplate template;
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigClientApplication.class, args);
	}
	
	@GetMapping("/checkClient")
	public String checkClient() {
		//System.out.println(url);
		//return url;
		//return template.getForObject(url, String.class);
		return "hello";
	}

}
