package com.style3.caixadesugestao.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table(name="contact")
@Entity
public class Contact {
	//id, name, 
	
	//para o relacionamento lista de telefones,
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	
	@NotBlank
	@Size(min = 2, max = 40, message = "O nome deve ter")
	private String name;
	
	@OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
	private List<Phone> phones = new ArrayList<>();
	
	@OneToOne(mappedBy = "contact", cascade = CascadeType.ALL, orphanRemoval = true)
	private Suggestion suggestion;
	
	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Suggestion getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(Suggestion suggestion) {
		this.suggestion = suggestion;
	}

	public Contact() {
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
