package com.bkav.demo.controller;

import com.bkav.demo.entities.Accounts;
import com.bkav.demo.entities.Events;
import com.bkav.demo.service.AccountService;
import com.bkav.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class EventController {
    @Autowired
    EventService eventService;
    @Autowired
    AccountService accountService;
    @PostMapping("createEvent")
    public ResponseEntity<Events> createEvent(@RequestBody Events event,@RequestParam("idPerson") String username) {

        Accounts acc= accountService.findById(username).get();
        event.setAccounts(acc);
        return ResponseEntity.ok().body(eventService.save(event));
    }
    @PutMapping("updateEvent")
    public ResponseEntity<Events> updateEvent(@RequestBody Events event,@RequestParam("idPerson") String username){

        Events e=eventService.findByIdPerSonAndId(username,event.getId());
        e.setDateCreated(event.getDateCreated());
        e.setEventName(event.getEventName());
        e.setDateEnd(event.getDateEnd());
        e.setDescription(event.getDescription());

        return ResponseEntity.ok(eventService.update(e));
    }
    @DeleteMapping("deleteEvent")
    public ResponseEntity<?> delete(@RequestParam("idEvent")int id,@RequestParam("idPerson") String username){
        Events e=eventService.findByIdPerSonAndId(username,id);
        eventService.delete(e.getId());
        return ResponseEntity.ok().body(null);
    }
    @GetMapping("findAllEvent")
    public ResponseEntity<List<Events>> getList(){
        return ResponseEntity.ok(eventService.getAll());
    }
}
