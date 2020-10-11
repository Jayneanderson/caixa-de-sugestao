package com.style3.caixadesugestao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Phone {
	//lista de telefones
	
	//contato para o relacionamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idphone")
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 11)
	@Column(name = "number")
	private String number;
	
	//muitos telefones para um contato
	@ManyToOne
	@JoinColumn(name = "idcontact")
	private Contact contact;
	
	public Phone() {
		super();
	}
	public Phone(String number, Contact contact) {
		this.number = number;
		this.contact = contact;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
}
