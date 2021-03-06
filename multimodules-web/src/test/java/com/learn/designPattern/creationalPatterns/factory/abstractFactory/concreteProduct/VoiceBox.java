package com.learn.designPattern.creationalPatterns.factory.abstractFactory.concreteProduct;

import com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.AbstractPeripheralProduct;
import com.learn.designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.OutputAble;

public class VoiceBox extends AbstractPeripheralProduct implements OutputAble{

	@Override
	public String output() {
		System.out.println("This is a voice box. Made In " + getMadeIn());
		return "I am a voice box, I am playing music.";
	}

}
