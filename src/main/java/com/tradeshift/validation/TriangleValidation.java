package com.tradeshift.validation;

import com.tradeshift.model.Triangle;

/**
 * Utility interface to create contract for validating a triangle
 * There is only one validator available right now which verifies the
 * length of sides to satisfy A+B>C for all sides
 * 
 * @author ashusaxena
 *
 */
public interface TriangleValidation {

	/**
	 * @param t
	 * 			The triangle object in question
	 * @return
	 * 		returns true if triangle is valid or false
	 */
	public boolean isValid(Triangle t);

	public String getErrorMessage();
}
