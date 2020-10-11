package com.style3.caixadesugestao.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Contact {
	//id, name, 
	
	//para o relacionamento lista de telefones,
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcontact")
	private Long id;
	
	@NotBlank
	@Size(min = 2, max = 40, message = "O nome deve ter no mínimo duas letras")
	private String name;
	
	@OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
	private List<Phone> phones = new ArrayList<>();
	
	@OneToOne(mappedBy = "contact", cascade = CascadeType.ALL) 
	private Suggestion suggestion;
	
	public Contact() {
		super();
	}
	
//	modificando métodos de adicionar telefones
	
	public List<Phone> getPhones(){
		return phones;
	}
	
	public void setPhones(List<String> phones) {
		for(String number : phones) {
			this.phones.add(new Phone(number, this));
		}
	}
	
	public void setAddPhone(String number) {
		this.phones.add(new Phone(number, this));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Suggestion getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(Suggestion suggestion) {
		this.suggestion = suggestion;
	}

}
