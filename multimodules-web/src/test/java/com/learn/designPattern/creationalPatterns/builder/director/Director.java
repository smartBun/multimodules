package com.learn.designPattern.creationalPatterns.builder.director;

import com.learn.designPattern.creationalPatterns.builder.builder.KeyboardBuilder;
import com.learn.designPattern.creationalPatterns.builder.meterial.AxisBrand;
import com.learn.designPattern.creationalPatterns.builder.meterial.KeycapMeterial;
import com.learn.designPattern.creationalPatterns.builder.meterial.PCBType;
import com.learn.designPattern.creationalPatterns.builder.meterial.ShellMeterial;

public class Director {
	private KeyboardBuilder keyboardBuilder = null;

	public Director(KeyboardBuilder keyboardBuilder) {
		this.keyboardBuilder = keyboardBuilder;
	}

	public void construct(KeycapMeterial keycap, AxisBrand axis, PCBType pcb, ShellMeterial shell) {
		keyboardBuilder.keycap(keycap).axis(axis).pcb(pcb).shell(shell);
	}
}