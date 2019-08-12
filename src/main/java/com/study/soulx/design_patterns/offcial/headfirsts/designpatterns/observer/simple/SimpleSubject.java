package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.observer.simple;

import java.util.ArrayList;
import com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.observer.simple.*;
public class SimpleSubject implements Subject {
	private ArrayList<java.util.Observer> observers;
	private int value = 0;
	
	public SimpleSubject() {
		observers = new ArrayList<java.util.Observer>();
	}
	
	public void registerObserver(java.util.Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(java.util.Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}


	@Override
	public void registerObserver(Observer o) {

	}

	@Override
	public void removeObserver(Observer o) {

	}

	public void notifyObservers() {
		for (java.util.Observer observer : observers) {
//			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}