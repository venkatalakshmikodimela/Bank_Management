package com.bank.exception;

public class AdminDataException extends RuntimeException
{
	 String exceptionmsg;

	public AdminDataException() {
		super();
	}

	public AdminDataException(String exceptionmsg) {
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
		return "AdminDataException [exceptionmsg=" + exceptionmsg + "]";
	}
	
}
