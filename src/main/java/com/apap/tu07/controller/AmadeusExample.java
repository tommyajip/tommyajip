package com.apap.tu07.controller;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.referenceData.Locations;

public class AmadeusExample {
	public static void main(String[] args) throws ResponseException {
		Amadeus amadeus = Amadeus
				.builder("fkbQPh06VaAO79rycLDEGflOFDEONK6M", "T2Wy6soWEtwqUQQA")
				.build();
		
		com.amadeus.resources.Location[] locations = amadeus.referenceData.locations.get(Params
				.with("keyword", "LON")
				.and("subType", Locations.ANY));
		
		System.out.println(locations);
	}
}