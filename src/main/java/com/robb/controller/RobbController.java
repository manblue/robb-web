package com.robb.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.robb.common.RobbReponse;
import com.robb.manager.RobbManager;


@RestController
@RequestMapping("robb/")
public class RobbController {

	@Autowired
	private RobbManager robbManager;
	
	
	@RequestMapping(value="add",method = RequestMethod.GET)
	public RobbReponse add(@RequestParam(name ="name")String name) {
		return robbManager.add(name);
	}
}
