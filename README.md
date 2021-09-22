## Application Symtom d'Heme Biotech
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Run](#run)
* [Description](#description)

## General info
This project is a tool for calculate number of symptoms from datasource.
The result is saved into à file.

	
## Technologies
Project is created with:
* java: 16
* Spring boot: 2.5.4
* maven : 3.8
	
## Setup
mvn clean install

## Run
If you work with a large file, you can increase memory of jvm with this arguments
-Xms2048m

You can custom configuration with a properties file with this arguments
-Dspring.config.location=path_of_application_properties
