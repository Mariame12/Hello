package com.hello.test.service;

import org.springframework.stereotype.Component;

import com.hello.test.model.Helloworld;

@Component
public class BusinessServices {
	
	public Helloworld getHelloworld() {
		Helloworld h= new Helloworld();
		return h;
	}

}
