package com.robb.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.robb.common.RobbReponse;
import com.robb.manager.RobbManager;


//@RestController
//@RequestMapping("robb/")
public class RobbController {

	@Autowired
	private RobbManager robbManager;
	
	
	@RequestMapping(value="add",method = RequestMethod.GET)
	public RobbReponse add(@RequestParam(name ="name")String name) {
		return robbManager.add(name);
	}
	
	public RobbReponse add1(@RequestParam(name="name") int name,String n1,String n2,String n3,
			int n4,Long n5,String[] n6,String n7,String n8,BigDecimal n9,List<String> n10) {
		return robbManager.add1(name, n1, n2, n3, n4, n5, n6, n7, n8, n9,n10);
	}

}
