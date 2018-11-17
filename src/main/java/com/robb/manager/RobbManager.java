package com.robb.manager;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

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
	
	@RequestMapping(value="add1",method ={ RequestMethod.GET,RequestMethod.POST})
	public RobbReponse add1(@RequestParam(name="name") int name,String n1,String n2,String n3,
			int n4,Long n5,String[] n6,String n7,String n8,BigDecimal n9,List<String> n10) {
		System.out.println("----"+getClass().getClassLoader());
		robbService.add(n1); 
		String aa = "nihao";
		//dkdjfdkjk
		return RobbReponse.addSuccessResponse("ok", new HashMap<String, Object>());
	}
	
	public boolean name1() {
		return true;
	}
	public int name2() {
		return 1;
	}
	public short name3() {
		return 3;
	}
	public long name4() {
		return 4;
	}
	public float name5() {
		return 5;
	}
	public int[] name6() {
		return null;
	}
	static{
		System.out.println("------"+RobbManager.class+"-"+RobbManager.class.getClassLoader());
	}
}
