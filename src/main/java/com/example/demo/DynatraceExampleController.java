package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.*;

@RestController
@Slf4j
public class DynatraceExampleController {
	final DynatraceExampleService service;

	public DynatraceExampleController(DynatraceExampleService service) {this.service = service;}

    @RequestMapping("/")
    public String index() {
        System.out.println("Example Dynatrace metric view thru OneAgent!");
        return service.method1("val1");
    }
}