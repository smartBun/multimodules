package com.learn.designPattern.creationalPatterns.factory.factoryMethod.concreteProduct;

import com.learn.designPattern.creationalPatterns.factory.factoryMethod.product.Writable;

public class BallPen implements Writable {

	@Override
	public void write(String content) {
		System.out.println("write with Ball Pen => " + content);
	}
	
}
