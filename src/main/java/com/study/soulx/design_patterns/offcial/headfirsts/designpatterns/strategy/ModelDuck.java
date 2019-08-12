package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model chapter_1");
	}
}
