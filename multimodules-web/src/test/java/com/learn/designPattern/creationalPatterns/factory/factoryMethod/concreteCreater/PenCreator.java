package designPattern.creationalPatterns.factory.factoryMethod.concreteCreater;

import designPattern.creationalPatterns.factory.factoryMethod.concreteProduct.BallPen;
import designPattern.creationalPatterns.factory.factoryMethod.concreteProduct.InkPen;
import designPattern.creationalPatterns.factory.factoryMethod.product.ProductID;
import designPattern.creationalPatterns.factory.factoryMethod.creater.Creator;
import designPattern.creationalPatterns.factory.factoryMethod.product.Writable;

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
