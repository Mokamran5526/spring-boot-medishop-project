package com.jsp.medishop.response;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author Md Kamran
 * @param <T>
 */
@Component
@Data
public class ResponseStructure<T> {

	private T data;
	private String msg;
	private int status;

}
