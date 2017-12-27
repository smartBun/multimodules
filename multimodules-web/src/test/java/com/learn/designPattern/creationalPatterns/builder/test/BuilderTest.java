package designPattern.creationalPatterns.builder.test;

import designPattern.creationalPatterns.builder.concreteBuilder.DiyKeyboardBuilder;
import designPattern.creationalPatterns.builder.director.Director;
import designPattern.creationalPatterns.builder.meterial.AxisBrand;
import designPattern.creationalPatterns.builder.meterial.KeycapMeterial;
import designPattern.creationalPatterns.builder.meterial.PCBType;
import designPattern.creationalPatterns.builder.meterial.ShellMeterial;
import designPattern.creationalPatterns.builder.product.DiyKeyboard;

public class BuilderTest {
	public static void main(String[] args) {
		DiyKeyboardBuilder diyKeyboardBuilder = new DiyKeyboardBuilder();
		Director director = new Director(diyKeyboardBuilder);
		director.construct(KeycapMeterial.ABS, AxisBrand.CHERRY, PCBType.BLUE, ShellMeterial.ALUMINUM);
		DiyKeyboard diyKeyboard = diyKeyboardBuilder.build();
		System.out.println(diyKeyboard);
	}
}
