package com.tradeshift.main;

import com.tradeshift.model.Triangle;
import com.tradeshift.validation.TriangleValidator;
import com.tradeshift.validation.impl.TriangleSideLengthValidationImpl;
import com.tradeshift.validation.impl.TriangleSidePositiveValidationImpl;

public class TriangleApplication {

	public static String getTypeOfTriangle(int a, int b, int c) {
		TriangleValidator tv = new TriangleValidator().addValidation(new TriangleSidePositiveValidationImpl())
				.addValidation(new TriangleSideLengthValidationImpl());
		Triangle t = new Triangle(a, b, c);
		if(!tv.validate(t)) {
			throw new IllegalArgumentException(tv.getErrorMessage());
		}
		t.setType(TriangleTypeQualifier.getInstance().qualify(t));
		return t.getType().name();
	}
}
