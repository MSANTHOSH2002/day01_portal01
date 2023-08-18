package com.example.demo.controller;

//public class CLASS001 
//{
//
//}

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CLASS001
{  
	@GetMapping("isp")
   public String Welcome()
     {
	   return "Welcome String Boot!";
     }
}
