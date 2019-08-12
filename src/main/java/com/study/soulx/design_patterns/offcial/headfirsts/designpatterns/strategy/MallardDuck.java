package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard chapter_1");
	}
}
