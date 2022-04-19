package com.bkav.demo.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="events")
public class Events {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="event_name")
	private String eventName;
	@Column(name="date_created",columnDefinition = "DATE")
	private LocalDate dateCreated;
	@Column(name="date_end",columnDefinition = "DATE")
	private LocalDate dateEnd;
	private String Description;
	
}
