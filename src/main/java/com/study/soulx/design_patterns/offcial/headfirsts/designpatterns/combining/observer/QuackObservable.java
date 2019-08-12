package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.combining.observer;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
