package com.test.dto;


import java.util.Date;

import com.test.model.Journey;

public class JourneyDto {
	public Journey getJourneyHistory() {
		Journey journey=null;
		journey=new Journey();
		journey.setSource("hyderbad");
		journey.setDestination("odisha");
		journey.setAmount(2345.89f);
		journey.setBusType("sleeper");
		journey.setDate(new Date());
		return journey;
	}
}
