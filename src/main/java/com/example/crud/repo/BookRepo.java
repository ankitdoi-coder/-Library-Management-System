package com.example.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.Book;
@Repository

public interface BookRepo extends JpaRepository<Book, Long> 
{
   
}
