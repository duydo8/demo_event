package com.bkav.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Account_Event")
public class AccountEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="username")
    private Accounts accountCreator;
    @JsonIgnore
    @ManyToMany
    @JoinTable(name="AcountEventTable",joinColumns = @JoinColumn(name="idEvent"),
            inverseJoinColumns = @JoinColumn(name="username"))
    private List<Accounts> accountsList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id")
    private Events events;


}
