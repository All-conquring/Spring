package com.aaron.entity;

public class Computer {
	
	private _Keyboard keyboard;
	private _Mouse mouse;
	private _U_disk udisk;
	
	public _Keyboard getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(_Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	public _Mouse getMouse() {
		return mouse;
	}
	public void setMouse(_Mouse mouse) {
		this.mouse = mouse;
	}
	public _U_disk getUdisk() {
		return udisk;
	}
	public void setUdisk(_U_disk udisk) {
		this.udisk = udisk;
	}
	
	public void assmbly(){
		System.out.println("��̨����ʹ��"+udisk.showVolume()+"���̣�"+keyboard.showKey()+"���̣�"+mouse.showBrand()+"��ꡣ");
	}

}
