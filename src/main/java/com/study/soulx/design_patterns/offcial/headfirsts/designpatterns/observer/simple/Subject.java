package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.observer.simple;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
