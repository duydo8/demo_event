package com.bkav.demo.payload;

import com.bkav.demo.entities.AccountEvent;

import javax.persistence.*;
import java.util.List;

public class EventPayLoad {

    private String eventName;
    private Long dateCreated;
    private Long dateEnd;
    private String Description;

@ElementCollection
    private List<String> accountEventList;

}
