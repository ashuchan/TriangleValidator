package com.tradeshift.validation;

import java.util.ArrayList;
import java.util.List;

import com.tradeshift.model.Triangle;

public class TriangleValidator {

	private List<TriangleValidation> validators;
	
	private String errorMessage;
	
	public TriangleValidator() {
		validators = new ArrayList<>();
	}
	
	public TriangleValidator addValidation(TriangleValidation tv) {
		validators.add(tv);
		return this;
	}
	
	public boolean validate(Triangle t) {
		for(TriangleValidation tv:validators) {
			if(!tv.isValid(t)) {
				setErrorMessage(tv.getErrorMessage());
				return false;
			}
		}
		return true;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	private void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
