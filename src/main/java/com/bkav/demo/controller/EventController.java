package com.bkav.demo.controller;

import com.bkav.demo.entities.*;
import com.bkav.demo.service.AccountEventAttendentService;
import com.bkav.demo.service.AccountEventService;
import com.bkav.demo.service.AccountService;
import com.bkav.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
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
    @Autowired
    AccountEventAttendentService accountEventAttendentService;
    @PostMapping("createEvent")
    public ResponseEntity<Events> createEvent(@RequestBody Events event) {
        // lay account creator
        Accounts accounts= event.getAccountCreator();
//        them event vaof account event
        List<Events> eventsList=new ArrayList<>();//accounts.getListEvent();
//        Events e=eventService.save(event);
        eventsList.add(event);
        accounts.setListEvent(eventsList);
        accountService.save(accounts);
        return ResponseEntity.ok().body(eventService.save(event));
    }

    @PostMapping("addOneAccountInEvent")
    public ResponseEntity<AccountEvent> AddOneAccountMemberEvent(@RequestBody AccountEventAttendent acc,
                                                           @RequestParam("idEvent") Long id) {
        Optional<Events> e = eventService.findByIdEvent(id);
        AccountEvent accountEvent= new AccountEvent();
        Long dateAdd = LocalDate.now().getLong(ChronoField.EPOCH_DAY);
        accountEvent.setEvents(e.get());
        accountEvent.setAccountEventAttendent(acc);
        accountEvent.setDateAdd(dateAdd);
        accountEvent.setAccountEventId(new AccountEventId(acc.getUsername(),id));


        accountEventAttendentService.save(acc);

        return ResponseEntity.ok().body(accountEventService.save(accountEvent));




    }


    @GetMapping("/getListEventByAccountMemberUsername")
    public ResponseEntity<List<Events>> getListEventByAccountMemberUsername(@RequestParam("memberUsername") String name) {
        return ResponseEntity.ok().body(eventService.getListEventByAccountMemberId(name));
    }


    @PostMapping("addListMemberInEvent")
    public ResponseEntity<Events> AddListAccountMemberEvent(@RequestBody List<AccountEventAttendent> accountEventAttendentList
            , @RequestParam("idEvent") Long id) {
        Optional<Events> e = eventService.findByIdEvent(id);
        for (AccountEventAttendent acc:accountEventAttendentList
             ) {
            AccountEvent accountEvent= new AccountEvent();
            Long dateAdd = LocalDate.now().getLong(ChronoField.EPOCH_DAY);
            accountEvent.setEvents(e.get());
            accountEvent.setAccountEventAttendent(acc);
            accountEvent.setDateAdd(dateAdd);
            accountEvent.setAccountEventId(new AccountEventId(acc.getUsername(),id));
            accountEventAttendentService.save(acc);
        }


        return ResponseEntity.ok().body(eventService.save(e.get()));


    }


    @GetMapping("findAllEvent")
    public ResponseEntity<List<Events>> getList() {
        return ResponseEntity.ok(eventService.getAll());
    }
}
