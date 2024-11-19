package com.example.demo;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
@RestController
@RequestMapping("/framework")
@Tag(name = "user", description = "the user API")
public class Testt {

    @GetMapping(path = "/getFile")
    public String getFile(@RequestParam("path") String path) throws Exception {
        return "Hello world";
    }
}
