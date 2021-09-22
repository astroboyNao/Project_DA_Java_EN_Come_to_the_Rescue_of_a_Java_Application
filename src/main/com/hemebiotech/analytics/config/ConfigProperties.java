package com.hemebiotech.analytics.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;

/**
 * The Class ConfigProperties.
 */
@ConfigurationProperties(prefix = "config") 
@Getter
public class ConfigProperties {
    
    /** The in file name. */
    private String inFileName = "symptoms.txt";
    
    /** The out file name. */
    private String outFileName = "result.out";
}																																																																																									