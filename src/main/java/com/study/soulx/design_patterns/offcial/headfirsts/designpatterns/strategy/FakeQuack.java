package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.strategy;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
