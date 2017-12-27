package designPattern.creationalPatterns.builder.product;

import designPattern.creationalPatterns.builder.meterial.AxisBrand;
import designPattern.creationalPatterns.builder.meterial.KeycapMeterial;
import designPattern.creationalPatterns.builder.meterial.PCBType;
import designPattern.creationalPatterns.builder.meterial.ShellMeterial;

public interface Keyboard {
	void setKeycap(KeycapMeterial keycap);
	void setAxis(AxisBrand axis);
	void setPcb(PCBType pcb);
	void setShell(ShellMeterial shell);
}
