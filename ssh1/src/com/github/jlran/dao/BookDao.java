package com.github.jlran.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.github.jlran.vo.Book;


public class BookDao extends HibernateDaoSupport{

	public void save(Book book) {
		//ʹ��sessionfactory��ģ��
		this.getHibernateTemplate().save(book);
	}
}
