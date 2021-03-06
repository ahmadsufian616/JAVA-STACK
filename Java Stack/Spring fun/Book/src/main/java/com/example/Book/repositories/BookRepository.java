package com.example.Book.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Book.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	
	List<Book> findAll();
	
	void deleteById(long Id);
	
	//update from table (....) where id=ID
	
		// this method finds books with descriptions containing the search string
	List<Book> findByDescriptionContaining(String search);

	// this method counts how many titles contain a certain string
	Long countByTitleContaining(String search);

	// this method deletes a book that starts with a specific title
	Long deleteByTitleStartingWith(String search);

}
