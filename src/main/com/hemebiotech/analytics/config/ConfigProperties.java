package com.hemebiotech.analytics.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;
/**
 * The Class ConfigProperties.
 */
@ConfigurationProperties(prefix = "config") 
@Data
public class ConfigProperties {
    
    /** The in file name. */
    private String inFileName;
    
    /** The out file name. */
    private String outFileName;
}																																																																																									