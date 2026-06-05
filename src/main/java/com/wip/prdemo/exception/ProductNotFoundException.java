package com.wip.prdemo.exception;

public class ProductNotFoundException extends RuntimeException {

	String resourceName;
	Long fieldid;
	String fieldName;

	public ProductNotFoundException(String message) {
		super(message);

	}

	public ProductNotFoundException(String resourceName, String fieldName, Long id) {
		super(String.format("%s not found with %s : %d", resourceName, fieldName, id));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldid = id;
	}

}
