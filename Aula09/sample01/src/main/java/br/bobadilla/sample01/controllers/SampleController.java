package br.bobadilla.sample01.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo")
public class SampleController {

    @RequestMapping("/hello")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("Olá mundo");
    }
}