package com.asi.microservice.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.asi.microservice.entity.Menu;

public interface MenuRepository extends CrudRepository<Menu, Long> {
	List<Menu> findByName(String name);
//	List<Menu> findAll();
}