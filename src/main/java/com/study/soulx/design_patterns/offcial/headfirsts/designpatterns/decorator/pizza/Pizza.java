package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.decorator.pizza;

public abstract class Pizza {
	String description = "Basic Pizza";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
