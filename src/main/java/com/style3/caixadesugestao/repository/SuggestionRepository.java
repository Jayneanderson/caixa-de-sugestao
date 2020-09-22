package com.style3.caixadesugestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.style3.caixadesugestao.model.Suggestion;

@Repository
public interface SuggestionRepository extends JpaRepository<Suggestion, Long>{

}
