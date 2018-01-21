package com.atguigu.collection.exception;

/**
 * 
  * @Description: 地址异常类
  * @author lidengwen
  * @date 2016年7月29日 下午2:00:48
  *
 */
public class CaseApproveException extends Exception{

	private static final long serialVersionUID = -5113266937432649821L;

	public CaseApproveException() {
		super();
	}

	public CaseApproveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CaseApproveException(String message, Throwable cause) {
		super(message, cause);
	}

	public CaseApproveException(String message) {
		super(message);
	}

	public CaseApproveException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
