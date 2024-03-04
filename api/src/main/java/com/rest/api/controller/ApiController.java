package com.rest.api.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.api.repository.MobilRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rest.api.model.Mobil;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    MobilRepository mobilRepository;

    @GetMapping("/mobils")
    public ResponseEntity<List<Mobil>> getMobilByMerk(@RequestParam(required = false) String merk) {
        try {
            List<Mobil> mobils = new ArrayList<Mobil>();

            if (merk == null)
                mobilRepository.findAll().forEach(mobils::add);
            else
                mobilRepository.findByMerk(merk).forEach(mobils::add);

            if (mobils.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(mobils, HttpStatus.OK);
        } catch (Exception e) {
            // handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}