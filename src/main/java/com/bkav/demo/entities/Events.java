package com.bkav.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
	@Column(name="date_created")
	private Long dateCreated;
	@Column(name="date_end")
	private Long dateEnd;
	private String Description;


}
