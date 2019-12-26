package com.example.hr.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.example.hr.data.exception.ErrorCode;

@XmlRootElement
public class ErrorMessage {

	private String message;
	private ErrorCode errorCode;
	private String debugCode;

	
	public ErrorMessage() {
	}

	public ErrorMessage(String message, ErrorCode errorCode, String debugCode) {
		this.message = message;
		this.errorCode = errorCode;
		this.debugCode = debugCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public String getDebugCode() {
		return debugCode;
	}

	public void setDebugCode(String debugCode) {
		this.debugCode = debugCode;
	}

}
