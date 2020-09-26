package com.style3.caixadesugestao.model;



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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	
	@NotBlank
	@Size(min = 10, max = 11)
	private String number;
	
	//muitos telefones para um contato
	@ManyToOne
	@JoinColumn(name = "contact_id")
	private Contact contact;
	
	public Phone() {
		
	}
	
	public Phone(String number, Contact contact) {
		
	}
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getNumber() {return number;}
	
	public void setNumber(String phone) {this.number = phone;}

}
