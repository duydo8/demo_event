package com.bkav.demo.entities;

import java.time.LocalDate;

import javax.persistence.*;

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
	@Column(name="date_created")
	private Long dateCreated;
	@Column(name="date_end")
	private Long dateEnd;
	private String Description;
	@ManyToOne
	@JoinColumn(name="username")
	private Accounts accounts;

	public Events(int id, String eventName, Long dateCreated, Long dateEnd, String description) {
		this.id = id;
		this.eventName = eventName;
		this.dateCreated = dateCreated;
		this.dateEnd = dateEnd;
		Description = description;
	}
}
