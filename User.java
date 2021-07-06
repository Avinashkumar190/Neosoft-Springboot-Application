package com.neosoft.lara.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
//import com.neosoft.lara.entity.User;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String firstName;

	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String surName;

	@NotNull(message="is required")
	private int pincode;

	@DateTimeFormat(pattern="dd-MM-yyyy")
	private String dob;

	@DateTimeFormat(pattern="dd-MM-yyyy")
	private String joiningDate;




}
