package com.style3.caixadesugestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.style3.caixadesugestao.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
