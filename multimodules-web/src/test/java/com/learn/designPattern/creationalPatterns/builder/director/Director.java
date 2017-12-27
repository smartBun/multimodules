package designPattern.creationalPatterns.builder.director;

import designPattern.creationalPatterns.builder.builder.KeyboardBuilder;
import designPattern.creationalPatterns.builder.meterial.AxisBrand;
import designPattern.creationalPatterns.builder.meterial.KeycapMeterial;
import designPattern.creationalPatterns.builder.meterial.PCBType;
import designPattern.creationalPatterns.builder.meterial.ShellMeterial;

public class Director {
	private KeyboardBuilder keyboardBuilder = null;

	public Director(KeyboardBuilder keyboardBuilder) {
		this.keyboardBuilder = keyboardBuilder;
	}

	public void construct(KeycapMeterial keycap, AxisBrand axis, PCBType pcb, ShellMeterial shell) {
		keyboardBuilder.keycap(keycap).axis(axis).pcb(pcb).shell(shell);
	}
}