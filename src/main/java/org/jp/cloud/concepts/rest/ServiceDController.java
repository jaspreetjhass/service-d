package org.jp.cloud.concepts.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("serviceD")
public class ServiceDController {

	@GetMapping("processRequest")
	public String processRequest() {
		log.info("controller D executing ________________________.");
		return "hello From D ";
	}
}
