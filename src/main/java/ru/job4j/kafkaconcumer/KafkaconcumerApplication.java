package ru.job4j.kafkaconcumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KafkaconcumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaconcumerApplication.class, args);
	}

}
