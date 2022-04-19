package com.bkav.demo.controller;

import com.bkav.demo.entities.Events;
import com.bkav.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class EventController {
    @Autowired
    EventService eventService;

    @PostMapping("createEvent")
    public ResponseEntity<Events> createEvent(@RequestBody Events event) {
        return ResponseEntity.ok().body(eventService.save(event));
    }
    @PutMapping("updateEvent")
    public ResponseEntity<Events> updateEvent(@RequestBody Events events){
        return ResponseEntity.ok(eventService.update(events));
    }
    @DeleteMapping("deleteEvent")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        eventService.delete(id);
        return ResponseEntity.ok().body(null);
    }
}
