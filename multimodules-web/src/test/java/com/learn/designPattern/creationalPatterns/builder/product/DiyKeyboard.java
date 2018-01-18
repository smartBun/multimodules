package com.learn.designPattern.creationalPatterns.builder.product;

import com.learn.designPattern.creationalPatterns.builder.concreteBuilder.DiyKeyboardBuilder;
import com.learn.designPattern.creationalPatterns.builder.meterial.AxisBrand;
import com.learn.designPattern.creationalPatterns.builder.meterial.KeycapMaterial;
import com.learn.designPattern.creationalPatterns.builder.meterial.PCBType;
import com.learn.designPattern.creationalPatterns.builder.meterial.ShellMaterial;

public class DiyKeyboard implements Keyboard{
	
	public KeycapMaterial keycap;
	public AxisBrand axis;
	public PCBType pcb;
	public ShellMaterial shell;

	public DiyKeyboard(DiyKeyboardBuilder diyKeyboardBuilder) {
		setKeycap(diyKeyboardBuilder.keycap);
		setAxis(diyKeyboardBuilder.axis);
		setPcb(diyKeyboardBuilder.pcb);
		setShell(diyKeyboardBuilder.shell);
	}

	@Override
	public void setKeycap(KeycapMaterial keycap) {
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
	public void setShell(ShellMaterial shell) {
		this.shell = shell;
	}

	public KeycapMaterial getKeycap() {
		return keycap;
	}

	public AxisBrand getAxis() {
		return axis;
	}

	public PCBType getPcb() {
		return pcb;
	}

	public ShellMaterial getShell() {
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
