package com.robb.contraller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robb.manager.RobbManager;


@RestController
@RequestMapping("robb/")
public class RobbController {

	@Autowired
	private RobbManager robbManager;
	
	@RequestMapping("add")
	public String add(String name) {
		return robbManager.add(name);
	}
}
