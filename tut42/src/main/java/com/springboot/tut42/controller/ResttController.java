package com.springboot.tut42.controller;

import com.springboot.tut42.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class ResttController {
    @GetMapping("/{id}")
    public String getDetails(@RequestParam(name = "q") String query,
                             @RequestParam(name = "time", required = false) Integer time,
                             @PathVariable(name = "id") Integer id) {
        return "Hello: " + id;
    }

    @PostMapping("/{id}")
    public String addDetails(@RequestBody User user,
                             @PathVariable(name = "id") Integer id) {
        return "Hello: " + user + " " + id;
    }

    @GetMapping("/")
    public ResponseEntity<String> get() {
        return ResponseEntity.status(HttpStatus.OK).body("Bye");
    }
}
