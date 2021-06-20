package com.example.Book.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.example.Book.models.Book;
import com.example.Book.repositories.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// returns all the books
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}

	public Book updateBook(Long id,String title,String desc,String lan ,int numofpages ) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
		Book book=	optionalBook.get();
		book.setTitle(title);
		book.setDescription(desc);
		book.setLanguage(lan);
		book.setNumberOfPages(numofpages);
		bookRepository.save(book);
		return book;
		
		}
		else {
			return null;
			
			
		}
		
	}

	// creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	public Book removebyid(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		bookRepository.deleteById(id);
		return optionalBook.get();

	}

	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
}
