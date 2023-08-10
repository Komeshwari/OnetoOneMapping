package com.association.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.association.entity.BookD;
import com.association.service.MappingService;

@RestController
public class MappingController {
	@Autowired
private MappingService service;
	@PostMapping("/OnetoOneC")
	public BookD bookController(@RequestBody BookD bookd)
	{
		return service.saveBook(bookd);
	}
}
