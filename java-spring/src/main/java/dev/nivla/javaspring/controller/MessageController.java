package dev.nivla.javaspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/v1/messages")
public class MessageController {
    
    @GetMapping(value="/")
    // public Map<String, String> get(@RequestParam String param) {
    public Map<String, String> get() {
        Map<String, String> response = new HashMap<>();
        response.put("msg", "This is my first API using Java Spring");
        return response;
    }
    
}
