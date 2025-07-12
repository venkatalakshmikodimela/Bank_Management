package com.bank.exception;

public class UserDataException extends RuntimeException
{
	String exceptionmsg;

	public UserDataException(String exceptionmsg) {
		super();
		this.exceptionmsg = exceptionmsg;
	}

	public UserDataException() {
		super();
	}

	public String getExceptionmsg() {
		return exceptionmsg;
	}

	public void setExceptionmsg(String exceptionmsg) {
		this.exceptionmsg = exceptionmsg;
	}

	@Override
	public String toString() {
		return "UserDataException [exceptionmsg=" + exceptionmsg + "]";
	}
	
}
