package com.example.restservice;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdatesController {

	private static final String template = "Regular Updates  %s";
	private static final String template2="Update Number is-  %s";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/updates")
	public Updates update(@RequestParam(value = "name", defaultValue = "on progress") String name) {
		return new Updates(counter.incrementAndGet(), String.format(template, name), String.format(template2 , (counter.incrementAndGet()-1)));
	}
}