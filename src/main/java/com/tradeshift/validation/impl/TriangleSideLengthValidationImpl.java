package com.tradeshift.validation.impl;

import com.tradeshift.model.Triangle;
import com.tradeshift.validation.TriangleValidation;

/**
 * Validates a triangle to check the sum of any two sides is more than the third
 * 
 * @author ashusaxena
 *
 */
public class TriangleSideLengthValidationImpl implements TriangleValidation {

	@Override
	public boolean isValid(Triangle t) {
		if(t.getA()+t.getB()<=t.getC()) {
			return false;
		}
		if(t.getB()+t.getC()<=t.getA()) {
			return false;
		}
		if(t.getC()+t.getA()<=t.getB()) {
			return false;
		}
		return true;
	}

	@Override
	public String getErrorMessage() {
		return "Sum of any two sides of triangle should be more than the third one";
	}

}
