package com.style3.caixadesugestao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

@Entity
public class Suggestion {
	// suggestion, date,

	// para o relacionamento name,contact
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	
	@NotBlank
	@Lob
	private String textSuggestion;
	
	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@OneToOne
	@JoinColumn(name = "contact_id")
	private Contact contact;
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Suggestion() {
		
	}

	public String getTextSuggestion() {
		return textSuggestion;
	}	

	public void setTextSuggestion(String textSuggestion) {
		this.textSuggestion = textSuggestion;
	}

	public Date getCreatedData() {
		return createdDate;
	}
	
	public void setCratedData() {
		this.createdDate = new Date();
	}

}
