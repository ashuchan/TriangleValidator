package com.tradeshift.logic;

import com.tradeshift.model.Triangle;
import com.tradeshift.model.TriangleType;

/**
 * Qualifies a triangle based on its properties to be Equilateral, Isosceles or Scalene
 * Concrete Implementations: EquilateralQualifier, Isosceles
 * Future implementations: RightAngleQualifier
 * 
 * @author ashusaxena
 *
 */
public interface TriangleQualifier {

	public boolean qualifies(Triangle t);
	
	public TriangleType qualifier();
}
