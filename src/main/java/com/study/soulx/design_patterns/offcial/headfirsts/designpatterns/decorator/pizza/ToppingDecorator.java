package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.decorator.pizza;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	public abstract String getDescription();
}
