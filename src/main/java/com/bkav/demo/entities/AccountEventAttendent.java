package com.bkav.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="account_event_attendent")
public class AccountEventAttendent {
    @Id
    private String username;
    private String password;
    private String fullname;

    @Column(name="date_of_birth")
    private Long dob;
    private String phone;
    private String email;
    private String address;
    private String verifyCode;

    @ManyToOne
    @JoinColumn(name="account_attendnet")
    private AccountEvent accountEvent;
}
