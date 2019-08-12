package com.study.soulx.design_patterns.offcial.headfirsts.designpatterns.factory.challenge;

import java.util.*;
import java.util.Calendar;

public class CalendarTestDrive {
 
	public static void main(String[] args) {
		ZoneFactory zoneFactory = new ZoneFactory();
		Calendar calendar = new PacificCalendar(zoneFactory);
		List<String> appts = Arrays.asList("appt 1", "appt 2");
		((PacificCalendar) calendar).createCalendar(appts);
//		calendar.;
	}
}
