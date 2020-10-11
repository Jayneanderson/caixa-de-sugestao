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
import javax.validation.constraints.NotNull;

@Entity
public class Suggestion {
	// suggestion, date,

	// para o relacionamento name,contact
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idsuggestion")
	private Long id;

	@NotBlank
	@Lob
	@Column(name = "text_suggestion")
	private String textSuggestion;

	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date creatDate = new Date();
	
	@OneToOne
	@NotNull 
	@JoinColumn(name = "idcontact")
	private Contact contact;

	public Suggestion() {
		super();
	}
//	Contato.setSugestions(this)
//	This.contato = contato

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTextSuggestion() {
		return textSuggestion;
	}

	public void setTextSuggestion(String textSuggestion) {
		this.textSuggestion = textSuggestion;
	}

	public Date getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
