package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.adapter.iterenum;

import java.util.*;

public class IteratorEnumeration implements Enumeration<Object> {
	Iterator<?> iterator;
 
	public IteratorEnumeration(Iterator<?> iterator) {
		this.iterator = iterator;
	}
 
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
 
	public Object nextElement() {
		return iterator.next();
	}
}
