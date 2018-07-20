package com.test.microservice.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.microservice.models.PaymentForm;

@RestController
public class MainController {
	
	public static final String template = "Hola";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/findform")
	public PaymentForm findForm(@RequestParam(value="name", defaultValue="world") String nombre){
		return new PaymentForm(counter.incrementAndGet(),String.format(template, nombre), nombre, nombre, null);
	}
}
