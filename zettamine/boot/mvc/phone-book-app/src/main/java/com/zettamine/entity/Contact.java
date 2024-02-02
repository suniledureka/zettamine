package com.zettamine.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTACT_DETAILS")
public class Contact implements Serializable{
	@Id
	@GeneratedValue
	@Column(name = "CONTACT_ID")
	private Integer contactId;

	@Column(name = "CONTACT_NAME")
	private String contactName;

	@Column(name = "CONTACT_NUMBER")
	private Long contactNumber;

	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;

	@Column(name = "ACTIVE_SW")
	private String activeSw;
}
