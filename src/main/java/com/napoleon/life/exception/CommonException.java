package com.napoleon.life.exception;

public class CommonException extends RuntimeException {

	private static final long serialVersionUID = -5835072341957883405L;
	
	private String errCode;
	private String errChineseMsg;
	
	public CommonException(String errCode, String message, String chineseMsg){
		super(message);
		this.errCode = errCode;
		this.errChineseMsg = chineseMsg;
	}
	
	public CommonException(String errCode, String errChineseMsg){
		this(errCode, errChineseMsg, errChineseMsg);
	}
	
	public CommonException(ModelCodeInterface exceptionEnum){
		this(exceptionEnum.getCode(), exceptionEnum.getMessage(), exceptionEnum.getChineseMessage());
	}
	
	public CommonException(ModelCodeInterface exceptionEnum, String message){
		this.errCode = exceptionEnum.getCode();
		this.errChineseMsg = message;
	}
	
	public CommonException(ModelCodeInterface exceptionEnum, Throwable cause){
		super(cause);
		this.errCode = exceptionEnum.getCode();
		this.errChineseMsg = exceptionEnum.getChineseMessage();
	}
	
	public CommonException(ModelCodeInterface exceptionEnum, Throwable cause, String message){
		super(cause);
		this.errCode = exceptionEnum.getCode();
		this.errChineseMsg = message;
	}

	public String getErrCode() {
		return errCode;
	}

	public String getErrChineseMsg() {
		return errChineseMsg;
	}
}
