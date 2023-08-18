package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CLASS002 
{   
	@Value("${var}")  
	private String name;
   @GetMapping("disp")  
   public String Welcome()
   {
	   return "welcome "+ name; 
   }
   
}
