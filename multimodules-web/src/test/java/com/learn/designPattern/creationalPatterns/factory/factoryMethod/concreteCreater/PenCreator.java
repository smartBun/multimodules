package com.learn.designPattern.creationalPatterns.factory.factoryMethod.concreteCreater;

import com.learn.designPattern.creationalPatterns.factory.factoryMethod.concreteProduct.BallPen;
import com.learn.designPattern.creationalPatterns.factory.factoryMethod.concreteProduct.InkPen;
import com.learn.designPattern.creationalPatterns.factory.factoryMethod.product.ProductID;
import com.learn.designPattern.creationalPatterns.factory.factoryMethod.creater.Creator;
import com.learn.designPattern.creationalPatterns.factory.factoryMethod.product.Writable;

// Concrete Creator
public class PenCreator extends Creator {

	private PenCreator() {
		
	}
	
	public static PenCreator getInstance() {
		return new PenCreator();
	}

	@Override
	public Writable create(ProductID id) {
		if (id == ProductID.BallPen) {
			return new BallPen();
		}
		if (id == ProductID.InkPen) {
			return new InkPen();
		}
		return null;
	}
	
}
