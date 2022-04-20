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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvent;

    @ManyToOne
    @JoinColumn(name = "username")
    private Accounts accountCreator;

    @OneToMany(mappedBy = "accountEvent")
    private List<AccountEventAttendent> accountEventAttendentList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Events events;


}
