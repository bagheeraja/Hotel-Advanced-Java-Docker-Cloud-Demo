package edu.wgu.d387_sample_code.controller;

import edu.wgu.d387_sample_code.service.WelcomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> displayWelcome (@RequestParam("lang") String lang) {
        Locale locale = Locale.forLanguageTag(lang);
        WelcomeService welcomeService = new WelcomeService(locale);
        return new ResponseEntity<> (welcomeService.getWelcomeMessage(), HttpStatus.OK);
    }
}
