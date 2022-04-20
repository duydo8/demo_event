package com.bkav.demo.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
	private Long id;
	@Column(name="event_name")
	private String eventName;
	@Column(name="date_created")
	private Long dateCreated;
	@Column(name="date_end")
	private Long dateEnd;
	private String Description;


	@OneToMany (mappedBy = "events")
	private List<AccountEvent> accountEventList;

	@ManyToOne
	@JoinColumn(name = "username")
	private Accounts accountCreator;

	public Events(Long id, String eventName, Long dateCreated, Long dateEnd, String description) {
		this.id = id;
		this.eventName = eventName;
		this.dateCreated = dateCreated;
		this.dateEnd = dateEnd;
		Description = description;
	}
}
