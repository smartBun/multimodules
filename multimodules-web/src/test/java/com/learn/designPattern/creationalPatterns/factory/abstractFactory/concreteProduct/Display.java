package com.learn.designPattern.creationalPatterns.factory.abstractFactory.concreteProduct;

import com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.AbstractPeripheralProduct;
import com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.OutputAble;

public class Display extends AbstractPeripheralProduct implements OutputAble {

	@Override
	public String output() {
		System.out.println("This is a display. Made In " + getMadeIn());
		return "Output a movie";
	}
}
