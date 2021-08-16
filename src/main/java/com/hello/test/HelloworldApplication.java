package com.hello.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hello.test.model.Helloworld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.hello.test.service.BusinessServices;


@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner{
	@ Autowired
	
	private BusinessServices bs;
	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Helloworld h= bs.getHelloworld();
		System.out.println(h);
	}

}
