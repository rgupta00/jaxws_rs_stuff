package com.demo;

import javax.jws.WebService;

@WebService
public interface Calculator {
	public int add(int a, int b);

}