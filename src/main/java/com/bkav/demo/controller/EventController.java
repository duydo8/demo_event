package com.bkav.demo.controller;

import com.bkav.demo.entities.AccountEvent;
import com.bkav.demo.entities.Accounts;
import com.bkav.demo.entities.Events;
import com.bkav.demo.service.AccountEventService;
import com.bkav.demo.service.AccountService;
import com.bkav.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class EventController {
    @Autowired
    EventService eventService;
    @Autowired
    AccountService accountService;
    @Autowired
    AccountEventService accountEventService;

    @PostMapping("createEvent")
    public ResponseEntity<AccountEvent> createEvent(@RequestBody Events event, @RequestParam("idAccountCreator") String username) {
        AccountEvent accountEvent = new AccountEvent();

        accountEvent.setAccountCreator(accountService.findById(username).get());

        accountEvent.setEvents(event);
//      System.out.println("NguyenNH after: "+acc);

        eventService.save(event);
        return ResponseEntity.ok().body(accountEventService.save(accountEvent));
    }

    @PostMapping("addEventWithOneMember")
    public ResponseEntity<Events> AddOneAccountMemberEvent(@RequestBody Accounts acc, @RequestParam("idEvent") int id) {
        Optional<Events> e = eventService.findByIdEvent(id);


        List<AccountEvent> accountEventList = e.get().getAccountEventList();
        AccountEvent accountEvent = new AccountEvent();
        accountEvent.setAccountsList(Arrays.asList(acc));
        accountEventList.add(accountEvent);
        accountEvent.setAccountCreator(accountService.getAccountCreatorByEventId(id));
        accountEventService.save(accountEvent);
        return ResponseEntity.ok().body(eventService.save(e.get()));


    }

    //getlistEvent
    @GetMapping("/getListEventByAccountMemberUsername")
    public ResponseEntity<List<Events>> getListEventByAccountMemberUsername(@RequestParam("memberUsername") String name) {
        return ResponseEntity.ok().body(eventService.getListEventByAccountMemberId(name));
    }
    // getListUserAttend

    @PostMapping("addEventWithListMember")
    public ResponseEntity<Events> AddListAccountMemberEvent(@RequestBody List<Accounts> accountsList, @RequestParam("idEvent") int id) {
        Optional<Events> e = eventService.findByIdEvent(id);

            List<AccountEvent> accountEventList = e.get().getAccountEventList();
            AccountEvent accountEvent = new AccountEvent();
            accountEvent.setAccountsList(accountsList);
            accountEventList.add(accountEvent);
            accountEvent.setAccountCreator(accountService.getAccountCreatorByEventId(id));
            return ResponseEntity.ok().body(eventService.save(e.get()));


    }

    //    @PutMapping("updateEvent")
//    public ResponseEntity<Events> updateEvent(@RequestBody Events event,@RequestParam("idPerson") String username){
//
//        Events e=eventService.findByIdPerSonAndId(username,event.getId());
//        e.setDateCreated(event.getDateCreated());
//        e.setEventName(event.getEventName());
//        e.setDateEnd(event.getDateEnd());
//        e.setDescription(event.getDescription());
//
//        return ResponseEntity.ok(eventService.update(e));
//    }
//    @DeleteMapping("deleteEvent")
//    public ResponseEntity<?> delete(@RequestParam("idEvent")int id,@RequestParam("idPerson") String username){
//        Events e=eventService.findByIdPerSonAndId(username,id);
//        eventService.delete(e.getId());
//        return ResponseEntity.ok().body(null);
//    }
    @GetMapping("findAllEvent")
    public ResponseEntity<List<Events>> getList() {
        return ResponseEntity.ok(eventService.getAll());
    }
}
