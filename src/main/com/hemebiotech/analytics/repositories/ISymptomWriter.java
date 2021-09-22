package com.hemebiotech.analytics.repositories;

import java.util.TreeMap;
/**
 * The Interface ISymptomWriter.
 */
public interface ISymptomWriter {
    
    /**
     * Save analytics symptom.
     *
     * @param analyticsSymptom the analytics symptom
     */
    public void saveAnalyticsSymptom(TreeMap<String, Integer> analyticsSymptom);
}
