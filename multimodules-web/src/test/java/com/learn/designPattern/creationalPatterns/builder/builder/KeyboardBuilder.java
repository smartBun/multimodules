package com.learn.designPattern.creationalPatterns.builder.builder;

import com.learn.designPattern.creationalPatterns.builder.meterial.AxisBrand;
import com.learn.designPattern.creationalPatterns.builder.meterial.KeycapMeterial;
import com.learn.designPattern.creationalPatterns.builder.meterial.PCBType;
import com.learn.designPattern.creationalPatterns.builder.meterial.ShellMeterial;

public interface KeyboardBuilder {
	public KeyboardBuilder keycap(KeycapMeterial keycap);
	public KeyboardBuilder axis(AxisBrand axis);
	public KeyboardBuilder pcb(PCBType pcb);
	public KeyboardBuilder shell(ShellMeterial shell);
}
