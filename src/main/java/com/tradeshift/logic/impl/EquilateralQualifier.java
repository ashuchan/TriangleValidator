package com.tradeshift.logic.impl;

import com.tradeshift.logic.TriangleQualifier;
import com.tradeshift.model.Triangle;
import com.tradeshift.model.TriangleType;

public class EquilateralQualifier implements TriangleQualifier {

	@Override
	public boolean qualifies(Triangle t) {
		if (t.getA() == t.getB() && t.getB() == t.getC()) {
			return true;
		}
		return false;
	}

	@Override
	public TriangleType qualifier() {
		return TriangleType.Equilateral;
	}

}
