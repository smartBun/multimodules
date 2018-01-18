package com.learn.designPattern.creationalPatterns.builder.builder;

import com.learn.designPattern.creationalPatterns.builder.meterial.AxisBrand;
import com.learn.designPattern.creationalPatterns.builder.meterial.KeycapMaterial;
import com.learn.designPattern.creationalPatterns.builder.meterial.PCBType;
import com.learn.designPattern.creationalPatterns.builder.meterial.ShellMaterial;

public interface KeyboardBuilder {
	public KeyboardBuilder keycap(KeycapMaterial keycap);
	public KeyboardBuilder axis(AxisBrand axis);
	public KeyboardBuilder pcb(PCBType pcb);
	public KeyboardBuilder shell(ShellMaterial shell);
}
