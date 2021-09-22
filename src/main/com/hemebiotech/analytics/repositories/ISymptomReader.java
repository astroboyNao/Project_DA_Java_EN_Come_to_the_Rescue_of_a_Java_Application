package com.hemebiotech.analytics.repositories;

import java.util.List;

import com.hemebiotech.analytics.common.AppException;


/**
 * The Interface ISymptomReader.
 */
public interface ISymptomReader {
	
	/**
	 * Gets the symptoms from a datasource.
	 *
	 * @return the list
	 * @throws AppException the application exception
	 */
	List<String> GetSymptoms() throws AppException;
}
