package com.bkav.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Data

@AllArgsConstructor
@NoArgsConstructor
public class AccountEventId implements Serializable {
    @Column(name="userAccountAttendee", nullable = false)
    private String userAccountAttendee;
    @Column(name="eventId", nullable = false)
    private Long eventId;
}
