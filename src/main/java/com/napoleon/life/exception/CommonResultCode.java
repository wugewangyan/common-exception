package com.napoleon.life.exception;

public enum CommonResultCode {

	/**
	 * 000000~111111定义系统异常
	 */
	SUCCESS("000000", "SUCCESS", "成功"),
	PARAMS_WRONG("000001", "PARAMS_WRONG", "请求参赛错误"),
	ACCESS_TOKEN_EXPIRED("000002", "ACCESS_TOKEN_EXPIRED", "access_token已经失效，请重新登陆"),
	SYSTEM_ERR("111111", "LIFE_ERR", "系统异常"),
	
	
	
	/**
	 * 200000~111111 common-user 异常枚举定义
	 */
	PHONE_NUMBER_HAS_REGISTER("200000", "PHONE_NUMBER_HAS_REGISTER", "该手机号码已经被注册，请登陆"),
	PHONE_CODE_EXPIRED("2000001", "PHONE_CODE_EXPIRED", "手机验证码已经失效,请重新获取"),
	PHONE_CODE_WRONG("200002", "PHONE_CODE_WRONG", "手机验证码错误"),
	ACCOUNT_NOT_EXIST("200003", "ACCOUNT_NOT_EXIST", "用户不存在，请注册"),
	PASSWORD_WRONG("200004", "PASSWORD_WRONG", "密码错误"),
	ACCOUNT_NOT_ACTIVATE("200005", "ACCOUNT_NOT_ACTIVATE", "账号未激活,请激活账户后重新登陆"),
	ACCOUNT_STATUS_INVALID("200006", "ACCOUNT_STATUS_INVALID", "账号被冻结或注销"),
	REJECT_SOURCE("200007", "REJECT_SOURCE_LOGIN", "未知的来源"),
	SEND_PHONE_CODE_FREQUENTLY("200008", "SEND_PHONE_CODE_FREQUENTLY", "发送手机验证码过于频繁，请稍后再试"),
	SEND_PHONE_CODE_ERROR("200008", "CREATE_PHONE_CODE_ERROR", "发送手机验证码失败"),
	DATE_FORMAT_ERROR("200009", "DATE_FORMAT_ERROR", "时间格式化错误"),
	WEIGHTINFO_NOT_FOUND("200010", "WEIGHTINFO_NOT_FOUND", "您的体重信息不存在"), 
	NOT_AUTH_TO_EDIT("200011", "NOT_AUTH_TO_EDIT", "您没有权限编辑该信息"),
	OP_TYPE_NOT_SUPPORT("200012", "OP_TYPE_NOT_SUPPORT", "不支持的操作类型"),
	WAISTINFO_NOT_FOUND("200013", "WAISTINFO_NOT_FOUND", "您的腰围信息不存在"),
	COST_ORDER_INFO_NOT_FOUND("200014", "COST_ORDER_INFO_NOT_FOUND", "您的消费订单信息不存在"),
	
	
	
	
	;
	
	private final String code;
	private final String message;
	private final String chineseMessage;
	
	private CommonResultCode(String code, String message, String chineseMessage){
		this.code = code;
		this.message = message;
		this.chineseMessage = chineseMessage;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public String getChineseMessage() {
		return chineseMessage;
	}
}
