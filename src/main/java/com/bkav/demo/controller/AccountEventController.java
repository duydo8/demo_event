package com.bkav.demo.controller;

import com.bkav.demo.entities.Events;
import com.bkav.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountEventController {
    @Autowired
    EventService eventService;
    @PostMapping("create")
    public ResponseEntity<Events> createEvent (@RequestBody Events events,
                                               @RequestParam("idAccountCreator") String user){

        return ResponseEntity.ok(eventService.save(events));
    }
}
