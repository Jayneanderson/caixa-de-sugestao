package com.style3.caixadesugestao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.style3.caixadesugestao.model.Contact;
import com.style3.caixadesugestao.model.Phone;
import com.style3.caixadesugestao.model.Suggestion;
import com.style3.caixadesugestao.repository.ContactRepository;
import com.style3.caixadesugestao.repository.SuggestionRepository;

@Controller
public class SuggestionController {

	@Autowired
	SuggestionRepository suggestionRepository;
	ContactRepository contactRepository;
//	@GetMapping("/")
//	public String listSuggestion(ModelAndView model) {
//		
//		model.setView("index");
//		model.addObject("index");
//		model.addObject("list", suggestionRepository.findAll());
//		return "/index";
//	}
	
	@GetMapping("/")
	public ModelAndView listSuggestion() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("list", suggestionRepository.findAll());
		return model;
	}
	
	@GetMapping("/new")//link
	public String getSuggestion(ModelAndView model) {
		
		return "/newSuggestion";//template
	}
	
	
	@PostMapping("/new")
	public String creatSuggestion(Suggestion suggestion) {
		
		Contact contact = new Contact();
		contact.getPhones().add(new Phone());
		contact.getName();
		suggestion.setContact(contact);
		
		
		contactRepository.save(contact);
		suggestionRepository.save(suggestion);
		return "redirect:/new";
	}
	
}
