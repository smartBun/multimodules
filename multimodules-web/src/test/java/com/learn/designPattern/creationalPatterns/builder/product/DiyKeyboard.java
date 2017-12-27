package designPattern.creationalPatterns.builder.product;

import designPattern.creationalPatterns.builder.concreteBuilder.DiyKeyboardBuilder;
import designPattern.creationalPatterns.builder.meterial.AxisBrand;
import designPattern.creationalPatterns.builder.meterial.KeycapMeterial;
import designPattern.creationalPatterns.builder.meterial.PCBType;
import designPattern.creationalPatterns.builder.meterial.ShellMeterial;

public class DiyKeyboard implements Keyboard{
	
	public KeycapMeterial keycap;
	public AxisBrand axis;
	public PCBType pcb;
	public ShellMeterial shell;

	public DiyKeyboard(DiyKeyboardBuilder diyKeyboardBuilder) {
		setKeycap(diyKeyboardBuilder.keycap);
		setAxis(diyKeyboardBuilder.axis);
		setPcb(diyKeyboardBuilder.pcb);
		setShell(diyKeyboardBuilder.shell);
	}

	@Override
	public void setKeycap(KeycapMeterial keycap) {
		this.keycap = keycap;
	}

	@Override
	public void setAxis(AxisBrand axis) {
		this.axis = axis;
	}

	@Override
	public void setPcb(PCBType pcb) {
		this.pcb = pcb;
	}

	@Override
	public void setShell(ShellMeterial shell) {
		this.shell = shell;
	}

	public KeycapMeterial getKeycap() {
		return keycap;
	}

	public AxisBrand getAxis() {
		return axis;
	}

	public PCBType getPcb() {
		return pcb;
	}

	public ShellMeterial getShell() {
		return shell;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("DIY Keyboard:");
		sb.append("\nKeycap : " + getKeycap());
		sb.append("\nAxis : " + getAxis());
		sb.append("\nPCB : " + getPcb());
		sb.append("\nShell : " + getShell());
		return sb.toString();
	}
}
