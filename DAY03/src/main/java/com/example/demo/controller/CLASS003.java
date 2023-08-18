package com.example.demo.controller;

//public class CLASS003 
//{
//
//}  
//package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CLASS003 
{   
	@Value("${colour}")  
	private String color;
   @GetMapping("display")  
   public String Welcome()
   {
	   return "My Favourite color is : "+ color; 
   }
   
}

