package com.neosoft.lara.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
public class UserRegistrationReply {

	private int id;
	private String firstName;
	private String surName;
	private int pincode;
	private String dob;
	private String joiningDate;
	String registrationStatus;





}
