package designPattern.creationalPatterns.builder.concreteBuilder;

import designPattern.creationalPatterns.builder.builder.KeyboardBuilder;
import designPattern.creationalPatterns.builder.meterial.AxisBrand;
import designPattern.creationalPatterns.builder.meterial.KeycapMeterial;
import designPattern.creationalPatterns.builder.meterial.PCBType;
import designPattern.creationalPatterns.builder.meterial.ShellMeterial;
import designPattern.creationalPatterns.builder.product.DiyKeyboard;

public class DiyKeyboardBuilder implements KeyboardBuilder{
	private DiyKeyboard diyKeyboard;
	public KeycapMeterial keycap;
	public AxisBrand axis;
	public PCBType pcb;
	public ShellMeterial shell;
	
	@Override
	public KeyboardBuilder keycap(KeycapMeterial keycap) {
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
	public KeyboardBuilder shell(ShellMeterial shell) {
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
