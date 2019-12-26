package com.example.hr.data.exception;

public enum ErrorCode {
	EMPLOYEE_NOT_FOUND(100);

	private int code;

	private ErrorCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
