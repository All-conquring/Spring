package com.aaron.entity;

public class Printer {
	
	private InkBox inkbox;
	private Paper paper;
	
	public InkBox getInkbox() {
		return inkbox;
	}
	public void setInkbox(InkBox inkbox) {
		this.inkbox = inkbox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public void print() {
		System.out.println("��ӡ��ʹ����" + paper.showSize() + "��ֽ����ӡ��" + inkbox.showColor() + "��ɫ��");
	}

}
