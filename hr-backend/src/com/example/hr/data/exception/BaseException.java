package com.example.hr.data.exception;

@SuppressWarnings("serial")
public class BaseException extends RuntimeException {

	private final ErrorCode errorCode;
	private final String debugCode;

	public BaseException(String message, ErrorCode errorCode, String debugCode) {
		super(message);
		this.errorCode = errorCode;
		this.debugCode = debugCode;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public String getDebugCode() {
		return debugCode;
	}

}
