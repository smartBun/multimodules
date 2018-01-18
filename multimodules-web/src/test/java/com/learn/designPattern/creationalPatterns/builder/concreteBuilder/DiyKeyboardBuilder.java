package com.learn.designPattern.creationalPatterns.builder.concreteBuilder;

import com.learn.designPattern.creationalPatterns.builder.builder.KeyboardBuilder;
import com.learn.designPattern.creationalPatterns.builder.meterial.AxisBrand;
import com.learn.designPattern.creationalPatterns.builder.meterial.KeycapMaterial;
import com.learn.designPattern.creationalPatterns.builder.meterial.PCBType;
import com.learn.designPattern.creationalPatterns.builder.meterial.ShellMaterial;
import com.learn.designPattern.creationalPatterns.builder.product.DiyKeyboard;

public class DiyKeyboardBuilder implements KeyboardBuilder{
	private DiyKeyboard diyKeyboard;
	public KeycapMaterial keycap;
	public AxisBrand axis;
	public PCBType pcb;
	public ShellMaterial shell;
	
	@Override
	public KeyboardBuilder keycap(KeycapMaterial keycap) {
		this.keycap = keycap;
		return this;
	}

	@Override
	public KeyboardBuilder axis(AxisBrand axis) {
		this.axis = axis;
		return this;
	}

	@Override
	public KeyboardBuilder pcb(PCBType pcb) {
		this.pcb = pcb;
		return this;
	}

	@Override
	public KeyboardBuilder shell(ShellMaterial shell) {
		this.shell = shell;
		return this;
	}

    public DiyKeyboard build() {
        if (diyKeyboard == null) {
        	diyKeyboard = new DiyKeyboard(this);
        }
        
        return diyKeyboard;
    }
}
