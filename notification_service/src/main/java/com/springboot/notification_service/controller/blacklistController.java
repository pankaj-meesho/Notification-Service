package com.springboot.notification_service.controller;


import com.springboot.notification_service.exception.ResourceNotFoundException;
//import com.springboot.notification_service.model.SMS;
import com.springboot.notification_service.model.Blacklist;

//import com.springboot.notification_service.repository.SMSRepository;
import com.springboot.notification_service.repository.blacklistRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/blacklist")

public class blacklistController {
    @Autowired
    private blacklistRepository blacklist_Repository;

    @GetMapping
    public List<Blacklist> getAllBlacklist(){
        return blacklist_Repository.findAll();
    }

    @PostMapping
    public Blacklist createBlacklist(@RequestBody Blacklist blacklist) {
        return blacklist_Repository.save(blacklist);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){

        Blacklist blacklist = blacklist_Repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Number not exist with id: " + id));

        blacklist_Repository.delete(blacklist);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
