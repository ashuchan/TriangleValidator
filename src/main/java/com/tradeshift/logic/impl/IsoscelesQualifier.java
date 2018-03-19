package com.tradeshift.logic.impl;

import com.tradeshift.logic.TriangleQualifier;
import com.tradeshift.model.Triangle;
import com.tradeshift.model.TriangleType;

public class IsoscelesQualifier implements TriangleQualifier {

	@Override
	public boolean qualifies(Triangle t) {
		if (t.getA() == t.getB() && t.getA() != t.getC()) {
			return true;
		}
		if (t.getB() == t.getC() && t.getC() != t.getA()) {
			return true;
		}
		if (t.getA() == t.getC() && t.getA() != t.getB()) {
			return true;
		}
		return false;
	}

	@Override
	public TriangleType qualifier() {
		return TriangleType.Isosceles;
	}

}
