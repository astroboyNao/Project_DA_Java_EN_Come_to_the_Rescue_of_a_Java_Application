package com.hemebiotech.analytics.services;


import java.util.TreeMap;

import org.springframework.stereotype.Service;

import com.hemebiotech.analytics.repositories.ISymptomReader;
import com.hemebiotech.analytics.repositories.ISymptomWriter;

import lombok.AllArgsConstructor;

/**
 * The Class AnalyticsCounter.
 */
@Service
@AllArgsConstructor
public class AnalyticsCounter {
	
	/** The symptom reader. */
	private ISymptomReader symptomReader;
	
	/** The symptom writer. */
	private ISymptomWriter symptomWriter;

	/**
	 * Process counts the number of occurrences per symptom in the data source
	 */
	public void process() {
		// use a treeMap for ordering, if you work with large data you can use linkedHashMap
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();

		this.symptomReader.GetSymptoms().stream().forEach((String key) -> {
			Integer numberOfOccurences = tmap.get(key);
			tmap.put(key, (numberOfOccurences == null) ? 1 : numberOfOccurences + 1);
		});
		
		this.symptomWriter.saveAnalyticsSymptom(tmap);
	}
}
