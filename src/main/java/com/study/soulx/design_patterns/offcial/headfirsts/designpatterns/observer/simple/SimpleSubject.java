package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.observer.simple;

import java.util.*;
import java.util.Observer;

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
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}