package com.leonlu.code.sample.webapp.ws;

import com.leonlu.code.sample.webapp.ws.configuration.ElasticsearchConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;


@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableAutoConfiguration(exclude = {ElasticsearchConfiguration.class})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
