package com.bkav.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "accounts")
public class Accounts {
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

	public Accounts(String username, String password) {
		this.username = username;
		this.password = password;
	}
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="role_name")
	private Role role;

    @OneToMany(mappedBy = "accountCreator")
	private List<Events> listEvent;


	@Override
	public String toString() {
		return "alo";
	}
}
