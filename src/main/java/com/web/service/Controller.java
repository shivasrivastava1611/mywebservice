package com.web.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;






@SpringBootApplication
public class Controller {

	
	private String resource="api.openweathermap.org/data/2.5/weather";
	
	private String idResource;
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	
	public static void main(String[] args) throws Exception {
		//SpringApplication.run(Controller.class);
		Controller controller = new Controller();
		controller.getEntity();
	}

	public void getEntity(){
	    System.out.println("Begin /GET request!");
	    String getUrl = "https://api.openweathermap.org/data/2.5/weather?q=London";
	    ResponseEntity getResponse = new RestTemplate().postForLocation(getForEntity(getUrl, DTO.class);
	    if(getResponse.getBody() != null){
	        System.out.println("Response for Get Request: " + getResponse.getBody().toString());    
	    }else{
	        System.out.println("Response for Get Request: NULL");
	    }
	}

	
	
	
	
	
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			Quote quote = restTemplate.getForObject(
//					"http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//			log.info(quote.toString());
//		};
//	}
	
	
}
