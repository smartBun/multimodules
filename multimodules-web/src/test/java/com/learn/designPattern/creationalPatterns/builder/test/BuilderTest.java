package com.learn.designPattern.creationalPatterns.builder.test;

import com.learn.designPattern.creationalPatterns.builder.concreteBuilder.DiyKeyboardBuilder;
import com.learn.designPattern.creationalPatterns.builder.director.Director;
import com.learn.designPattern.creationalPatterns.builder.meterial.AxisBrand;
import com.learn.designPattern.creationalPatterns.builder.meterial.KeycapMaterial;
import com.learn.designPattern.creationalPatterns.builder.meterial.PCBType;
import com.learn.designPattern.creationalPatterns.builder.meterial.ShellMaterial;
import com.learn.designPattern.creationalPatterns.builder.product.DiyKeyboard;

public class BuilderTest {
	public static void main(String[] args) {
		DiyKeyboardBuilder diyKeyboardBuilder = new DiyKeyboardBuilder();
		Director director = new Director(diyKeyboardBuilder);
		director.construct(KeycapMaterial.ABS, AxisBrand.CHERRY, PCBType.BLUE, ShellMaterial.ALUMINUM);
		DiyKeyboard diyKeyboard = diyKeyboardBuilder.build();
		System.out.println(diyKeyboard);
	}
}
