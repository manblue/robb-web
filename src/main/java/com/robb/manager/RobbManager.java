package com.robb.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.robb.annotation.AutoController;
import com.robb.service.RobbService;

@Component
@AutoController
public class RobbManager {

	@Autowired
	private RobbService robbService;
	
	public String add(String name) {
		return robbService.add(name);
	}
}
