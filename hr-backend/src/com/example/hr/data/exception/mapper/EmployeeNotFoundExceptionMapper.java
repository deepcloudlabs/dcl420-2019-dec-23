package com.example.hr.data.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.example.hr.data.exception.EmployeeNotFoundException;
import com.example.hr.dto.ErrorMessage;

@Provider
public class EmployeeNotFoundExceptionMapper implements ExceptionMapper<EmployeeNotFoundException>{

	@Override
	public Response toResponse(EmployeeNotFoundException e) {
		return Response.status(Response.Status.BAD_REQUEST)
				       .entity(new ErrorMessage(e.getMessage(),e.getErrorCode(),e.getDebugCode()))
				       .build();
	}

}
