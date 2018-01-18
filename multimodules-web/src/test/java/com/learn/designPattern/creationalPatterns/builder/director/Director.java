package com.learn.designPattern.creationalPatterns.builder.director;

import com.learn.designPattern.creationalPatterns.builder.builder.KeyboardBuilder;
import com.learn.designPattern.creationalPatterns.builder.meterial.AxisBrand;
import com.learn.designPattern.creationalPatterns.builder.meterial.KeycapMaterial;
import com.learn.designPattern.creationalPatterns.builder.meterial.PCBType;
import com.learn.designPattern.creationalPatterns.builder.meterial.ShellMaterial;

public class Director {
	private KeyboardBuilder keyboardBuilder;

	public Director(KeyboardBuilder keyboardBuilder) {
		this.keyboardBuilder = keyboardBuilder;
	}

	public void construct(KeycapMaterial keycap, AxisBrand axis, PCBType pcb, ShellMaterial shell) {
		keyboardBuilder.keycap(keycap).axis(axis).pcb(pcb).shell(shell);

	}
}