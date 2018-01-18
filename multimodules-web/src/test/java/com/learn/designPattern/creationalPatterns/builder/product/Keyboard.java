package com.learn.designPattern.creationalPatterns.builder.product;

import com.learn.designPattern.creationalPatterns.builder.meterial.AxisBrand;
import com.learn.designPattern.creationalPatterns.builder.meterial.KeycapMaterial;
import com.learn.designPattern.creationalPatterns.builder.meterial.PCBType;
import com.learn.designPattern.creationalPatterns.builder.meterial.ShellMaterial;

public interface Keyboard {
	void setKeycap(KeycapMaterial keycap);
	void setAxis(AxisBrand axis);
	void setPcb(PCBType pcb);
	void setShell(ShellMaterial shell);
}
