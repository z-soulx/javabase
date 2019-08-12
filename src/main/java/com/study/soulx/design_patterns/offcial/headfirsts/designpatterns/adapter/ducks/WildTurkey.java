package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.adapter.ducks;

public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("Gobble gobble");
	}
 
	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}
