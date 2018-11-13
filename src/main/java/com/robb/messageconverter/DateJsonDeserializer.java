package com.robb.messageconverter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.expression.ParseException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * 鑷畾涔塲ackson 鏃ユ湡搴忓垪鍖�
 *
 * ClassName: EnumTestJsonSerializer 
 * @Description: jackson  鏃ユ湡搴忓垪鍖�
 *
 * @author yangyu
 * @date 2016骞�鏈�9鏃�7:09:39
 * @version
 */
public class DateJsonDeserializer extends JsonDeserializer<Date> {
	private static final String DATE_PATTERN_MINUTE = "yyyy-MM-dd HH:mm";
	private static final String DATE_PATTERN_HOUR = "yyyy-MM-dd HH";
	private static final String DATE_PATTERN_DEFAULT = "yyyy-MM-dd HH:mm:ss";
	private static final String DATE_PATTERN_DAY = "yyyy-MM-dd";
	private static final String DATE_PATTERN_DAY_SLASH = "MM/dd/yyyy";
    private boolean allowEmpty = true;  
  
	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		String text = p.getText();
		if (this.allowEmpty && StringUtils.isBlank(text)) {  
            return null; 
        } else {
            try {  
            	Date date = null;
            	boolean flag = false;
            	try {
            		date = stringToDate(text, DATE_PATTERN_DEFAULT);
					flag = true;
					
				} catch (Exception e) {
				}
				if(!flag){
					try {
						date = stringToDate(text, DATE_PATTERN_DAY);
						flag = true;
					} catch (Exception e) {
					}
				}
				if(!flag){
					try {
						date = stringToDate(text, DATE_PATTERN_MINUTE);
						flag = true;
					} catch (Exception e) {
					}
				}
				if(!flag){
					try {
						date = stringToDate(text, DATE_PATTERN_HOUR);
						flag = true;
					} catch (Exception e) {
					}
				}
				
				if(!flag){
					try {
						date = stringToDate(text, DATE_PATTERN_DAY_SLASH);
						flag = true;
					} catch (Exception e) {
					}
				}
				
            	return date;
            } catch (ParseException ex) {  
                throw new IllegalArgumentException("Could not parse date: " + ex.getMessage(), ex);  
            }  
        }  
	}
	
	 /**
     * 灏嗗瓧绗︿覆杞寲涓烘棩鏈熴� 瀛楃涓叉牸寮�"YYYY-MM-DD")銆�
     * 渚嬪锛�2012-07-01"鎴栬�"2012-7-1"鎴栬�"2012-7-01"鎴栬�"2012-07-1"鏄瓑浠风殑銆�
     * @throws java.text.ParseException 
     */
    public static Date stringToDate(String str, String pattern) throws java.text.ParseException {
        Date dateTime = null;
        SimpleDateFormat formater = new SimpleDateFormat(pattern);
        dateTime = formater.parse(str);
        return dateTime;
    }
    
    /**
     * 灏嗘棩鏈熻浆鍖栦负瀛楃涓�
     */
    public static String dateToString(Date date, String pattern) {
        String str = "";
        try {
            SimpleDateFormat formater = new SimpleDateFormat(pattern);
            str = formater.format(date);
        } catch (Throwable e) {
        }
        return str;
    }

}
