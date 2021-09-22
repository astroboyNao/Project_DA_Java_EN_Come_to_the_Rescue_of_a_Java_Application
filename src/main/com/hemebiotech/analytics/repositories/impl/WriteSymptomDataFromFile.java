package com.hemebiotech.analytics.repositories.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hemebiotech.analytics.common.AppException;
import com.hemebiotech.analytics.config.ConfigProperties;
import com.hemebiotech.analytics.repositories.ISymptomWriter;

import lombok.AllArgsConstructor;

/**
 * The Class WriteSymptomDataFromFile.
 */
@Repository
@AllArgsConstructor
public class WriteSymptomDataFromFile implements ISymptomWriter {

	/** The config properties. */
	private ConfigProperties configProperties;

	/**
	 * Save analytics symptom.
	 *
	 * @param analyticsSymptom the analytics symptom
	 */
	@Override
	public void saveAnalyticsSymptom(Map<String, Integer> analyticsSymptom) {
		try (FileWriter writer = new FileWriter(configProperties.getOutFileName())) {
			analyticsSymptom.entrySet().stream().forEach(mapEntry -> {
				try {
					writer.write(mapEntry.getKey() + ":" + mapEntry.getValue() + "\n");
				} catch (IOException e) {
					throw new RuntimeException("erreur écriture dans le fichier");
				}
			});

		} catch (IOException e) {
			throw new AppException("Erreur écriture du fichier {}", e.getCause());
		}
	}

}
