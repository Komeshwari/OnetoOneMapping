package com.association.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.association.entity.BookD;
import com.association.repo.RepoClass;

@Service
public class MappingServiceImp implements MappingService {
	@Autowired
	private RepoClass repo;
	public BookD saveBook(BookD bookd)
	{
		return repo.save(bookd);
		
	}
}
