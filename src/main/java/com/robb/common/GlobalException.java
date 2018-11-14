package com.robb.common;

import java.io.Serializable;

/**
 * 寮傚父澶勭悊
 * @author lc
 * @createDate 2015骞�0鏈�7鏃�7:04:30
 *
 */
public class GlobalException extends Exception implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 寮傚父缂栫爜
	 */
	private int code;
	
	public GlobalException(int code,String message) {
		super(message);
		this.code =code;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	

}
