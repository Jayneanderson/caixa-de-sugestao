package com.style3.caixadesugestao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table(name="phone")
@Entity
public class Phone {
	//lista de telefones
	
	//contato para o relacionamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 11)
	private String number;
	
	//muitos telefones para um contato
	@ManyToOne
	@JoinColumn(name = "contact_id")
	private Contact contact;
	
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
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getNumber() {
		return number;
	}
	
	public void setNumber(String phone) {
		this.number = phone;
	}

}
