package org.adaitaw.email.controller;


import org.adaitaw.email.emaildto.EmailDTO;
import org.adaitaw.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    @RequestMapping(value = "vali_email", params = "email")
    public ResponseEntity<EmailDTO> save(@RequestParam String email){
        EmailDTO savedValiEmail = emailService.save(email);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedValiEmail);
    }
}
