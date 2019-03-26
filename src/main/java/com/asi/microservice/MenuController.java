package com.asi.microservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asi.microservice.entity.Menu;
import com.asi.microservice.repository.MenuRepository;

@RequestMapping("/jcic")
@RestController
public class MenuController {

	@Autowired
	MenuRepository menuRepository;
	
	@GetMapping("/menu")
	public Iterable<Menu> menu() {
	
		return menuRepository.findAll();
	}
}
