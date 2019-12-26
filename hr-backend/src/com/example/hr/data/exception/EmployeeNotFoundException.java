package com.example.hr.data.exception;

import javax.ejb.ApplicationException;

@SuppressWarnings("serial")
@ApplicationException
public class EmployeeNotFoundException extends BaseException {

	public EmployeeNotFoundException(String message, ErrorCode errorCode, String debugCode) {
		super(message,errorCode,debugCode);
	}

}
