package com.example.spring.app.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/support")
public class SupportController {

  @GetMapping
  public String hide(){

    return "hide";
  }
}
