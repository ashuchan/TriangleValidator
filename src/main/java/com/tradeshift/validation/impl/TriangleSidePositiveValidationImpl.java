package com.tradeshift.validation.impl;

import com.tradeshift.model.Triangle;
import com.tradeshift.validation.TriangleValidation;

/**
 * Validates triangle side length to be all more than 0
 * 
 * @author ashusaxena
 *
 */
public class TriangleSidePositiveValidationImpl implements TriangleValidation {

	@Override
	public boolean isValid(Triangle t) {
		if(t.getA()<=0||t.getB()<=0||t.getC()<=0) {
			return false;
		}
		return true;
	}

	@Override
	public String getErrorMessage() {
		return "Length of all sides of triangle should more than 0";
	}

}
