package com.tradeshift.main;

import java.util.ArrayList;
import java.util.List;

import com.tradeshift.logic.TriangleQualifier;
import com.tradeshift.logic.impl.EquilateralQualifier;
import com.tradeshift.logic.impl.IsoscelesQualifier;
import com.tradeshift.model.Triangle;
import com.tradeshift.model.TriangleType;

public class TriangleTypeQualifier {

	private List<TriangleQualifier> qualifiers;
	
	private static TriangleTypeQualifier instance;
	
	private TriangleTypeQualifier() {
		qualifiers = new ArrayList<>();
	}
	
	public static TriangleTypeQualifier getInstance() {
		if(instance == null) {
			synchronized (TriangleTypeQualifier.class) {
				if(instance==null) {
					instance = new TriangleTypeQualifier();
					instance.qualifiers.add(new EquilateralQualifier());
					instance.qualifiers.add(new IsoscelesQualifier());
				}
			}
		}
		return instance;
	}
	
	public TriangleType qualify(Triangle t) {
		for(TriangleQualifier tq:qualifiers) {
			if(tq.qualifies(t)) {
				return tq.qualifier();
			}
		}
		return TriangleType.Scalene;
	}
}
