package designPattern.creationalPatterns.builder.builder;

import designPattern.creationalPatterns.builder.meterial.AxisBrand;
import designPattern.creationalPatterns.builder.meterial.KeycapMeterial;
import designPattern.creationalPatterns.builder.meterial.PCBType;
import designPattern.creationalPatterns.builder.meterial.ShellMeterial;

public interface KeyboardBuilder {
	public KeyboardBuilder keycap(KeycapMeterial keycap);
	public KeyboardBuilder axis(AxisBrand axis);
	public KeyboardBuilder pcb(PCBType pcb);
	public KeyboardBuilder shell(ShellMeterial shell);
}
