package com.robb.common;

import java.util.List;
import java.util.Map;

public class RobbReponse {

	private int code;
	
	private Map<String, Object> data;
	
	private List list;
	

	private  RobbReponse(int code,Map<String, Object> data) {
		this.code = code;
		this.data = data;
	}

	public static RobbReponse getRobbReponse(int code,Map<String, Object> data) {
		return new RobbReponse(code, data);
	}
}
