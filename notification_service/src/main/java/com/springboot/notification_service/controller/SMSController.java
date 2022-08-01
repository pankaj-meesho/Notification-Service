package com.springboot.notification_service.controller;

import com.springboot.notification_service.exception.ResourceNotFoundException;
import com.springboot.notification_service.model.SMS;
import com.springboot.notification_service.repository.SMSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/sms")
public class SMSController {
    @Autowired
    private SMSRepository smsRepository;

    @GetMapping
    public List<SMS> getAllSMS(){
        return smsRepository.findAll();
    }
    @PostMapping
    public SMS createSMS(@RequestBody SMS sms) {
        return smsRepository.save(sms);
    }

    @GetMapping("{id}")
    public ResponseEntity<SMS> getSMSById(@PathVariable  long id){
        SMS sms = smsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("SMS not exist with id:" + id));
        return ResponseEntity.ok(sms);
    }
}
