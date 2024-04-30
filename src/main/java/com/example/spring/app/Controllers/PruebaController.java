package com.example.spring.app.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/test")
public class PruebaController {

  @GetMapping
  public String getAll(){
    return "all";
  }

  @PostMapping
  public String create(@RequestBody String test) {
      
      return test;
  }
  


}
  


