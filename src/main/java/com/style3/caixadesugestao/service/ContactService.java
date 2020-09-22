package com.style3.caixadesugestao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.style3.caixadesugestao.model.Contact;
import com.style3.caixadesugestao.repository.ContactRepository;
@Service
public class ContactService implements CrudGeneric<Contact, Long>{
	
	@Autowired
	ContactRepository contactRepository;

	@Override
	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Contact object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	

	
}
