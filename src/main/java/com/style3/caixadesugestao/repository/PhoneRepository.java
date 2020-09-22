package com.style3.caixadesugestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.style3.caixadesugestao.model.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long>{

}
