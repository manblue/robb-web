package com.robb.messageconverter;

import java.util.Date;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * jackson 鑷畾涔塲son杞崲
 *
 * ClassName: CommonObjectMapper 
 * @Description: jackson 鑷畾涔塲son杞崲
 *
 * @author tangzhi
 * @date 2015-12-21
 * @version
 */
public class CommonObjectMapper extends ObjectMapper {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7489733502597864157L;


	/**
	 * 娉ㄥ唽鑷畾涔夊簭鍒楀寲
	 */
	public CommonObjectMapper() {
		super();
		@SuppressWarnings("deprecation")
		SimpleModule module = new SimpleModule("custom enum Serializer",
				new Version(1, 0, 0, "custom-enum-jsonmodule"));
		module.addSerializer(Enum.class,new CustomEnumJsonSerializer());
		module.addDeserializer(Date.class, new DateJsonDeserializer());
		this.registerModule(module);
		this.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);  // 璁剧疆鏋氫妇鍙互浼爊ull鎴栬�"",瑙ｆ瀽涓�null
	}


}
