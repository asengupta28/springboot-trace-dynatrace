package com.example.demo;

import org.springframework.stereotype.Service;
import com.sun.tools.sjavac.Log;

@Service
public class DynatraceExampleService {
	public String method1(String val1) {
		System.out.println("Called DynatraceExampleService.method1()");
		return method2(val1);
	}
	public String method2(String val1) {
		System.out.println("Called DynatraceExampleService.method2()");
		return method3(val1);
	}
	public String method3(String val1) {
		System.out.println("Called DynatraceExampleService.method3()");
		return val1 + "Method-3";
	}
}
