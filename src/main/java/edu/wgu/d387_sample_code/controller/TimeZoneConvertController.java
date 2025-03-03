package edu.wgu.d387_sample_code.controller;

import edu.wgu.d387_sample_code.service.TimeZoneConvert;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TimeZoneConvertController {

    @GetMapping("/onlinepres")
    public ResponseEntity<String> presentationDisplay() {
        String display = "Join us online October 11, 2025 for a live presentation at " + TimeZoneConvert.getTime();
        return new ResponseEntity<String> (display, HttpStatus.OK);
    }
}
