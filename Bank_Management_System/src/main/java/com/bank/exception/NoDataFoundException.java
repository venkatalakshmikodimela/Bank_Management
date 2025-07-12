package com.bank.exception;

public class NoDataFoundException extends RuntimeException
{
	String exceptionmsg;

	public NoDataFoundException(String exceptionmsg) {
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
		return "NoDataFoundException [exceptionmsg=" + exceptionmsg + "]";
	}

	public NoDataFoundException() {
		super();
	}
	
	
}
