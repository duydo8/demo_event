package com.bkav.demo.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="accounts")
public class Accounts {
	@Id
	private String username;
	private String password;
	private String fullname;

	@Column(name="date_of_birth",columnDefinition = "DATE")
	private LocalDate dob;
	private String phone;
	private String email;
	private String address;

	public Accounts(String username, String password) {
		this.username = username;
		this.password = password;
	}
	@OneToMany(mappedBy = "accounts")
	List<Events> listEvent;
}
