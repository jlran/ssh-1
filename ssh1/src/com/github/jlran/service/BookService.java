package com.github.jlran.service;

import org.springframework.transaction.annotation.Transactional;

import com.github.jlran.dao.BookDao;
import com.github.jlran.vo.Book;

@Transactional
public class BookService {

	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	public void add(Book book) {
		bookDao.save(book);
	}

}
