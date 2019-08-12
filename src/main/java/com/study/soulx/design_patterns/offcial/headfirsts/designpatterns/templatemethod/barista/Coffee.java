package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.templatemethod.barista;

public class Coffee extends CaffeineBeverage {
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}
