package org.example.controller;


import org.example.entity.Report;
import org.example.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Report> getInfo ( @PathVariable long id){
        Report report = reportService.get(id);
        return ResponseEntity.ok().body(report);

    }

    @PostMapping(value = "/report/{bp}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> save ( @PathVariable long bp){
        reportService.save(bp);
        return ResponseEntity.ok().body("success");

    }
}
