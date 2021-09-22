package com.hemebiotech.analytics.repositories.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hemebiotech.analytics.common.AppException;
import com.hemebiotech.analytics.config.ConfigProperties;
import com.hemebiotech.analytics.repositories.ISymptomReader;

import lombok.AllArgsConstructor;

/**
 * Simple brute force implementation
 *
 */

@Repository
@AllArgsConstructor
public class ReadSymptomDataFromFile implements ISymptomReader {

	private ConfigProperties configProperties;
	
	
	public List<String> GetSymptoms(){
		
		try {
			return Files.readAllLines(Paths.get(this.configProperties.getInFileName()));
		} catch (IOException e) {
			throw new AppException("Fichier non trouvé", e.getCause());
		}
	}

}
