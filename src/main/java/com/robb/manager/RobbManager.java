package com.robb.manager;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.robb.annotation.AutoController;
import com.robb.common.RobbReponse;
import com.robb.service.RobbService;

@Component
@AutoController
@RequestMapping(value="robb/")
public class RobbManager {

	@Autowired
	private RobbService robbService;
	
	@RequestMapping(value="add",method = RequestMethod.GET)
	public RobbReponse add(@RequestParam(name="name") String name) {
		System.out.println("----"+getClass().getClassLoader());
		robbService.add(name); 
		//dkdjfdkjk
		return RobbReponse.addSuccessResponse("ok", new HashMap<String, Object>());
	}
	
	
	static{
		System.out.println("------"+RobbManager.class+"-"+RobbManager.class.getClassLoader());
	}
}
