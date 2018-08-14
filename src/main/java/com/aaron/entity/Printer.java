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
		System.out.println("打印机使用了" + paper.showSize() + "的纸，打印出" + inkbox.showColor() + "颜色。");
	}

}
