package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.PatientDetails;
import org.example.entity.Report;
import org.example.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping(value = "/patient",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> save (@RequestBody PatientDetails patientDetails){
        log.info("Patient controller:: save()");
        patientService.save(patientDetails);
        return ResponseEntity.ok().body("success");

    }

    @GetMapping(value = "/patient/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PatientDetails> getInfo ( @PathVariable long id){
        PatientDetails patientDetails = patientService.get(id);
        return ResponseEntity.ok().body(patientDetails);

    }

    @DeleteMapping (value = "/patient/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> delete ( @PathVariable long id){
        patientService.delete(id);
        return ResponseEntity.ok().body("Deleted Successfully");

    }
}

