package com.xyueji.coldeye.common.exception;

import lombok.Data;

/**
 * 自定义异常
 */
@Data
public class MyException extends RuntimeException {
	private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public MyException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public MyException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}

	public MyException(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}

	public MyException(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}

//	public static void main(String[] args) {
//    	try{
//			int i = 1/0;
//		}catch (Exception e){
//    		throw new MyException("除法中分母不能为空");
//		}
//
//	}
}
