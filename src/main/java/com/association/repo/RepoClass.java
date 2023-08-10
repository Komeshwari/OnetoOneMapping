package com.association.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.association.entity.BookD;
@Repository
public interface RepoClass extends JpaRepository<BookD,Integer> {

}
