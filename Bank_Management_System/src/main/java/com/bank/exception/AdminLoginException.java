package com.bank.exception;

public class AdminLoginException extends RuntimeException
{
	String exceptionmsg;

	public AdminLoginException(String exceptionmsg) {
		super();
		this.exceptionmsg = exceptionmsg;
	}

	public String getExceptionmsg() {
		return exceptionmsg;
	}

	public void setExceptionmsg(String exceptionmsg) {
		this.exceptionmsg = exceptionmsg;
	}

	@Override
	public String toString() {
		return "adminexceptionmsg [exceptionmsg=" + exceptionmsg + "]";
	}

	public AdminLoginException() {
		super();
	}
	
}
