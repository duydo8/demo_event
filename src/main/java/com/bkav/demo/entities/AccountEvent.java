package com.bkav.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Account_Event")
public class AccountEvent {
    @EmbeddedId
    private  AccountEventId accountEventId;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="account_event_attendent_user")
    AccountEventAttendent accountEventAttendent;
    @JsonIgnore
    @ManyToOne
    @JoinColumn
    Events events;
    @Column(name="date_add")
    private Long dateAdd;



}
