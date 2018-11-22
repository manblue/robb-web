package com.robb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robb.common.RobbReponse;
import com.robb.manager.TestManager;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

	@Autowired
	private TestManager testManager;
	
	@RequestMapping("/name")
	public RobbReponse name() {
		return testManager.name();
	}
	
}
