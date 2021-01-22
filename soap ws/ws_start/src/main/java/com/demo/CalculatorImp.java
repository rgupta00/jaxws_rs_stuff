package com.demo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.Calculator")
public class CalculatorImp implements Calculator {

	@Override
	public int add(int a, int b) {

		return a + b;
	}

}