package com.robb.contraller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.robb.common.RobbReponse;
import com.robb.manager.RobbManager;


@RestController
@RequestMapping("robb/")
public class RobbController {

	@Autowired
	private RobbManager robbManager;
	
	
	@ResponseBody
	@RequestMapping("add")
	public RobbReponse add(String name) {
		robbManager.add(name);
		return RobbReponse.getRobbReponse(0, new HashMap<String, Object>());
	}
}
