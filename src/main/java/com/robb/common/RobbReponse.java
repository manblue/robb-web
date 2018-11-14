package com.robb.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RobbReponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2602920942057863260L;

	private static String LIST_KEY = "list";
	
	private static String TOTAL_KEY = "total";

    /**
     * 错误代码
     */
    private int code;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 数据
     */
    private Map<String, Object> data;

    public RobbReponse(int code, String msg, Map<String, Object> data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    /**
     * 添加失败响应
     * @Description: 添加无数据响应
     * @param code		响应代码
     * @param message	响应结果
     * @return   
     * @return LYCReponse  
     * @throws
     * @author tangzhi
     * @date 2016-5-6
     */
    public static RobbReponse addFailedResponse(int code, String message) {
        return new RobbReponse(code, message, null);
    }

    /**
     * 添加成功响应
     * @Description: 添加成功响应
     * @param code		响应代码
     * @param message	响应结果
     * @return   
     * @return LYCReponse  
     * @throws
     * @author tangzhi
     * @date 2016-5-6
     */
    public static RobbReponse addSuccessResponse(String message,
                                                Map<String, Object> data) {
        return new RobbReponse(0, message, data);
    }

    /**
     * 添加列表响应
     * @Description: 添加列表响应
     * @param code		响应代码
     * @param message	响应结果
     * @return   
     * @return LYCReponse  
     * @throws
     * @author tangzhi
     * @date 2016-5-6
     */
    public static RobbReponse addListResponse(String message, int total,
                                             List<?> list) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put(TOTAL_KEY, total);
        data.put(LIST_KEY, list);
        return new RobbReponse(0, message, data);
    }
    
    /**
     * 添加无分页列表响应
     * @Description: 添加无分页列表响应
     * @param code		响应代码
     * @param message	响应结果
     * @return   
     * @return LYCReponse  
     * @throws
     * @author tangzhi
     * @date 2016-5-6
     */
    public static RobbReponse addListResponse(String message, List<?> list) {
		Map<String, Object> data = new HashMap<String, Object>();
		int total = 0;
		if(null != list && list.size() != 0){
			total = list.size();
		}
		data.put(TOTAL_KEY, total);
		data.put(LIST_KEY, list);
		return new RobbReponse(0, message, data);
	}
	
}
