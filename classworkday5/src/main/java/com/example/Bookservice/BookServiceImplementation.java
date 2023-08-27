package com.example.Bookservice;

import org.apache.el.stream.Optional;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Book.entity.Book;
import com.example.BookRepository.BookRepository;
@Service
public class BookServiceImplementation implements BoookService {
	
		
	@Autowired

	private BookRepository bookRepository;

	@Override
	public Book getBook(int id) {
		Optional<Book> optional=bookRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}


	@Override

	public int addBook(Book book) {
		Book save=bookRepository.save(book);
		return save.getId();
		}



	@Override

	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}


	@Override
	public void updateBook(Book book) {
		bookRepository.save(book);
		
	}


	@Override
	public void deleteBook(int id) {
		Optional<Book> optional = bookRepository.findById(id);
		if(!optional.isEmpty()) {
		  bookRepository.delete(optional.get());
		}
	}






	}


