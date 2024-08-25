package dev.gustavo.ApiNaruto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gustavo.ApiNaruto.model.Ninjas;
import dev.gustavo.ApiNaruto.service.NinjasServices;

@RestController
@RequestMapping("/api/ninjas")

public class NinjasController {
    
    @Autowired
    private NinjasServices service;

    @PostMapping("/add")
    public ResponseEntity<Ninjas> addNinjas(@RequestBody Ninjas ninja){
      Ninjas newNinja = service.createNinja(ninja);
      return new ResponseEntity<>(newNinja, HttpStatus.CREATED);
    }
}
