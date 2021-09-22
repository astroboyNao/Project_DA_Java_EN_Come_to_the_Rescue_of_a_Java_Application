package com.hemebiotech.analytics.repositories;

import java.util.Map;
/**
 * The Interface ISymptomWriter.
 */
public interface ISymptomWriter {
    
    /**
     * Save analytics symptom.
     *
     * @param analyticsSymptom the analytics symptom
     */
    public void saveAnalyticsSymptom(Map<String, Integer> analyticsSymptom);
}
