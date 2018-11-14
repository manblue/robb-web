package com.robb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.robb.common.ExceptionCode;
import com.robb.common.GlobalException;
import com.robb.common.RobbReponse;


/**
 * BaseController
 * 
 * @date 2015骞�2鏈�鏃�涓婂崍11:23:08
 * @author maliang
 */
public class BaseController { 

	private Logger LYC_EXCEPTION = LoggerFactory.getLogger("LYC_EXCEPTION");

	/**
	 * 寮傚父淇℃伅澶勭悊
	 * 
	 * @Description: 寮傚父淇℃伅澶勭悊
	 * @param e
	 * @return
	 * @return LYCReponse
	 * @throws
	 * @author tangzhi
	 * @date 2016-5-6
	 */
	@ExceptionHandler({ Exception.class })
	public RobbReponse exception(Exception e) {
		if (e instanceof GlobalException) {
			GlobalException ge = (GlobalException) e;
			LYC_EXCEPTION.error("globaleException :{}", e);
			return RobbReponse.addFailedResponse(ge.getCode(), ge.getMessage());
		} else if (e instanceof RuntimeException && 
				e.getMessage() != null && 
				e.getMessage().startsWith("流程控制-")) {
			LYC_EXCEPTION.error("flowControlException Message:{}", e);
			return RobbReponse.addFailedResponse(ExceptionCode.FLOW_CONTROL_ERROR_CODE, e.getMessage());
		} else {
			e.printStackTrace();
			LYC_EXCEPTION.error("{} Message:{},{}", e.getClass().getName(), e.getMessage(), e);
			return RobbReponse.addFailedResponse(ExceptionCode.SERVER_ERROR, "鏈嶅姟鍣ㄥ紓甯革紝璇疯仈绯荤鐞嗗憳");
		}

	}

}
