package com.learn.designPattern.creationalPatterns.builder.product;

import com.learn.designPattern.creationalPatterns.builder.meterial.AxisBrand;
import com.learn.designPattern.creationalPatterns.builder.meterial.KeycapMeterial;
import com.learn.designPattern.creationalPatterns.builder.meterial.PCBType;
import com.learn.designPattern.creationalPatterns.builder.meterial.ShellMeterial;

public interface Keyboard {
	void setKeycap(KeycapMeterial keycap);
	void setAxis(AxisBrand axis);
	void setPcb(PCBType pcb);
	void setShell(ShellMeterial shell);
}
