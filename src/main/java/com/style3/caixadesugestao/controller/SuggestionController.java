package com.style3.caixadesugestao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.style3.caixadesugestao.model.Contact;
import com.style3.caixadesugestao.model.Suggestion;
import com.style3.caixadesugestao.repository.ContactRepository;
import com.style3.caixadesugestao.repository.SuggestionRepository;

@Controller
public class SuggestionController {

	@Autowired
	SuggestionRepository suggestionRepository;
	@Autowired
	ContactRepository contactRepository;
	
	@GetMapping("/")
	public ModelAndView listSuggestion() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("listSuggestion", suggestionRepository.findAll());
		return model;
	}
	
	@GetMapping("/new")//link
	public ModelAndView getSaveSuggestion() {
		ModelAndView model = new ModelAndView("newSuggestion");
		
		Contact contact = new Contact();
		Suggestion suggestion = new Suggestion();
		contact.setSuggestion(suggestion);
		
		model.addObject("contact", contact);
		
		return model;
	}
	
	
	@PostMapping("/new")
	public String setSaveNewSuggestion(Contact contact, Suggestion suggestion) {
		
		suggestion = contact.getSuggestion();
		suggestion.setContact(contact);
		
		contactRepository.save(contact);
 		return "redirect:/new";
	}
	
}
