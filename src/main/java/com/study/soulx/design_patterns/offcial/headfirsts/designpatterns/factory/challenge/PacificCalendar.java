package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.factory.challenge;

import java.util.*;
import java.util.Calendar;

public class PacificCalendar extends Calendar {
	public PacificCalendar(ZoneFactory zoneFactory) {
		Zone zone = zoneFactory.createZone("US/Pacific");
		// make a calendar for the pacific zone
		// ...
	}
	public void createCalendar(List<String> appointments) {
		// make calendar from appointments
		System.out.println("Making the calendar");
	}

	@Override
	protected void computeTime() {

	}

	@Override
	protected void computeFields() {

	}

	@Override
	public void add(int field, int amount) {

	}

	@Override
	public void roll(int field, boolean up) {

	}

	@Override
	public int getMinimum(int field) {
		return 0;
	}

	@Override
	public int getMaximum(int field) {
		return 0;
	}

	@Override
	public int getGreatestMinimum(int field) {
		return 0;
	}

	@Override
	public int getLeastMaximum(int field) {
		return 0;
	}
}