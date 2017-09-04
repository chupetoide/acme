package com.identicum.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestProperty
{
	@Value("${secret.property.xml}")
	private String secretXmlValue;
	
	@Value("${secret.property.java}")
	private String secretJavaValue;
	
	@RequestMapping(value = {"/print"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> print()
	{
		String output = String.format("Property XML: %s \nProperty Java: %s", this.secretXmlValue, this.secretJavaValue);
		return new ResponseEntity<String>(output, HttpStatus.OK);
	}
}
