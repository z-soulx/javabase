package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.state.gumballstatewinner;

public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	
	public void refill();
}
