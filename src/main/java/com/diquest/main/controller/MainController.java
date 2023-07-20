package com.diquest.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @GetMapping("/test")
  public boolean test() {
    return true;
  }

  @GetMapping("/awfsome")
  public String awfsome() {
    return "awfsome";
  }
}
