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
     * �������
     */
    private int code;

    /**
     * ������Ϣ
     */
    private String msg;

    /**
     * ����
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
     * ���ʧ����Ӧ
     * @Description: �����������Ӧ
     * @param code		��Ӧ����
     * @param message	��Ӧ���
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
     * ��ӳɹ���Ӧ
     * @Description: ��ӳɹ���Ӧ
     * @param code		��Ӧ����
     * @param message	��Ӧ���
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
     * ����б���Ӧ
     * @Description: ����б���Ӧ
     * @param code		��Ӧ����
     * @param message	��Ӧ���
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
     * ����޷�ҳ�б���Ӧ
     * @Description: ����޷�ҳ�б���Ӧ
     * @param code		��Ӧ����
     * @param message	��Ӧ���
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
