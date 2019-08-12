package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.combining.composite;

public class RubberDuck implements Quackable {
 
	public void quack() {
		System.out.println("Squeak");
	}
  
	public String toString() {
		return "Rubber Duck";
	}
}
