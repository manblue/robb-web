package com.robb.common;

/**
 * 閿欒锛屽紓甯哥紪鐮�
 * <p>
 * 鐩墠鏈嶅姟灞傝姹傚姣忎釜涓氬姟鍙彁鍊′竴涓紪鐮�
 * 
 * @author maliang
 */
public class ExceptionCode {

	/**
	 * 缁熶竴鎴愬姛缂栫爜
	 * 
	 * @author tangzhi
	 */
	public static final int COMMON_SUCCESS_CODE = 0;

	/**
	 * 鏈嶅姟閿欒
	 *
	 * @date 2015骞�1鏈�鏃�涓嬪崍4:46:14
	 * @author luogang
	 */
	public static final int SERVER_ERROR = 1000;
	/**
	 * 鏈嶅姟閿欒
	 *
	 * @date 2015骞�1鏈�鏃�涓嬪崍4:46:14
	 * @author luogang
	 */
	public static final int SERVER_URL_ERROR = 1001;
	/**
	 * @description 鏃ュ織妯″潡寮傚父缂栫爜
	 * @author lc
	 * @createDate 2015骞�0鏈�7鏃�6:57:16
	 */
	public static final int LOG_CODE = 2000;

	/**
	 * @description 瀹㈡埛妯″潡寮傚父缂栫爜
	 * @author lc
	 * @createDate 2015骞�2鏈�鏃�7:22:16
	 */
	public static final int CUSTOMER_ERROR_CODE = 3000;

	/**
	 * 鍙傛暟楠岃瘉閿欒
	 */
	public static final int PARAM_VALUE_ERROR = 4000;

	/**
	 * @description 鏉冮檺妯″潡寮傚父缂栫爜
	 * @author luogang
	 * @createDate 2015骞�2鏈�鏃�5:01
	 */
	public static final int AUTH_ERROR_CEDE = 5000;
	/**
	 * @description 鏉冮檺妯″潡寮傚父缂栫爜
	 * @author luogang
	 * @createDate 2015骞�2鏈�鏃�5:01
	 */
	public static final int AUTH_EXE_CEDE = 5001;

	/**
	 * @description 鏈烘瀯寮傚父缂栫爜
	 * @author luogang
	 * @createDate 2015骞�2鏈�鏃�5:01
	 */
	public static final int INSTITUTION_ERROR_CEDE = 6000;

	/**
	 * @description 鍙傛暟楠岃瘉閿欒
	 * @author lc
	 * @createDate 2015骞�2鏈�鏃�7:22:16
	 */
	public static final int LOAN_ERROR_CODE = 7000;

	/**
	 * @description 绯荤粺寮傚父浠ｇ爜
	 * @author lc
	 * @createDate 2015骞�2鏈�鏃�7:22:16
	 */
	public static final int SYSTEM_ERROR_CODE = 8000;

	/**
	 * 浜у搧寮傚父缂栫爜
	 */
	public static final int PRODUCT_CODE = 9000;

	/**
	 * 璐㈠姟寮傚父浠ｇ爜
	 */
	public static final int FINANCE_ERROR_CODE = 10000;

	/**
	 * 淇″寮傚父浠ｇ爜
	 */
	public static final int CREDIT_ERROR_CODE = 11000;
	/**
	 * 杩愯惀寮傚父浠ｇ爜
	 */
	public static final int OPERATION_ERROR_CODE = 12000;

	/**
	 * 涓氬姟寮傚父浠ｇ爜
	 */
	public static final int BUSINESS_ERROR_CODE = 13000;

	/**
	 * 瀹氭椂浠诲姟鐩稿叧閿欒淇℃伅
	 */
	public static final int TIMER_TASK_CODE = 50000;

	/**
	 * 鎹㈠崱鐢宠寮傚父缂栫爜
	 */
	public static final int CHANGE_CARD_ERROR_CODE = 14000;

	/**
	 * 璧勯噾寮傚父浠ｇ爜
	 */
	public static final int POINT_ERROR_CODE = 15000;

	/**
	 * 鍌敹寮傚父浠ｇ爜
	 */
	public static final int PAYMENT_ERROR_CODE = 16000;

	/**
	 * 杩涗欢璧勬枡寮傚父浠ｇ爜
	 */
	public static final int LOAN_DATA_ERROR_CODE = 17000;

	/**
	 * 鍙戦�鐭俊
	 */
	public static final int SEND_MSG_ERROR_CODE = 18000;

	/**
	 * 杩涗欢璧勬枡寮傚父浠ｇ爜
	 */
	public static final int ATTACHMENT_ERROR_CODE = 19000;

	/**
	 * 娑堟伅寮傚父浠ｇ爜
	 */
	public static final int MESSAGE_ERROR_CODE = 20000;

	/**
	 * 杩樻寮傚父浠ｇ爜
	 */
	public static final int REPAY_ERROR_CODE = 21000;
	
	/**
	 * sql璇彞鍙嶅皠寮傚父
	 */
	public static final int MODE_INVOKE_ERROR_CODE = 22000;
	
	/**
	 * 鐞嗚储寮傚父鐮�
	 */
	public static final int FINANCIAL_ERROR_CODE = 800;
	
	/**
	 * 瀵煎叆寮傚父
	 */
	public static final int IMPORT_ERROR_CODE = 23000;
	
	/**
	 * 瀵煎叆杩樻璁″垝鏍囪瘑鍓嶇涓嶆彁绀轰笓鏈夌爜
	 * 濡傛灉瀵煎叆杩樻璁″垝鏃讹紝鍑虹幇鈥滆繕娆剧敵璇峰凡瀛樺湪鈥濈殑寮傚父淇℃伅鏃讹紝骞朵笖杩涗欢鐨勮繕娆剧敵璇�鐘舵�涓哄噺鍏嶅鏍镐腑,
	 * 鎴栬�杩樻鐢宠鐘舵�涓虹敵璇蜂腑鍜屽噺鍏嶆垚鍔熷苟涓旇杩涗欢鐨勮储鍔¤姹傜姸鎬佹槸璐㈠姟鎿嶄綔鎴愬姛鍜岃储鍔℃搷浣滃け璐ュ垯闇�鎶婇敊璇俊鎭彁绀哄埌鍓嶇
	 */
	public final static int IMPORT_LOAN_REPAY_NOT_TINY_CODE = 24000;
	
	/**
	 * 杞﹁締瀹℃牳璁㈠崟寮傚父
	 */
	public final static int CAR_AUDIT_ORDER_CODE = 25000;

	/**
	 * 澶栭儴鏈烘瀯寮傚父
	 */
	public final static int ORG_ERROR_CODE = 26000;
	
	/**
	 * 娴佺▼鎺у埗寮傚父
	 */
	public final static int FLOW_CONTROL_ERROR_CODE = 27000;
	/**
	 * 闃熷垪娑堟伅
	 */
	public final static int QUEUE_MESSAGE_ERROR_CODE = 28000;
	
	/**
	 * 鐢ㄦ埛妯″潡寮傚父
	 */
	public final static int USER_ERROR_CODE = 29000;
	
	
	/**
	 * 缂撳瓨鏇存柊鍑虹幇寮傚父
	 */
	public final static int CACHE_UPDATE_EXCEPTION_CODE = 30000;	
}
