package com.tp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.model.User;

@RestController
public class DefaultController {
@GetMapping
public String userString()
{
User u=new User(1,"teste","teste",30);
return u.toString();
}
@GetMapping("hello")
public String welcome()
{
return "spring is coming";	

}
@PostMapping("mydata")
public String datapost()
{
return "you are posting data";	
}
@GetMapping("home")

}
