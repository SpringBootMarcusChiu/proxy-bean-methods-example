package com.marcuschiu.proxybeanmethodsexample;

import com.marcuschiu.proxybeanmethodsexample.config.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyBeanMethodsExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProxyBeanMethodsExampleApplication.class, args);
	}

	@Autowired
	RestTemplate subClass1RestTemplate;

	@Autowired
	RestTemplate subClass2RestTemplate;

	@Override
	public void run(String... args) {
		System.out.println("\n\n\n\n");
		System.out.println("if output different then they are different beans");
		System.out.println(subClass1RestTemplate.state);
		System.out.println(subClass2RestTemplate.state);
		System.out.println("\n\n\n\n");
	}
}
