package com.robb.manager;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public RobbReponse add(String name) {
		robbService.add(name);
		return RobbReponse.getRobbReponse(0, new HashMap<String, Object>());
	}
}
