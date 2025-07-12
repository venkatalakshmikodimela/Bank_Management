package com.bank.exception;

public class InvalidAmountException extends RuntimeException 
{
	String execeptionmsg;

	public InvalidAmountException(String execeptionmsg) {
		super();
		this.execeptionmsg = execeptionmsg;
	}

	public String getExeception() {
		return execeptionmsg;
	}

	public void setExeception(String execeptionmsg) {
		this.execeptionmsg = execeptionmsg;
	}

	@Override
	public String toString() {
		return "InvalidAmountException [exeception=" + execeptionmsg + "]";
	}

	public InvalidAmountException() {
		super();
	}
	
}
