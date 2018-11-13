package com.robb.common;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class RobbReponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2602920942057863260L;

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

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
}
