package com.team3.LMS.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.team3.LMS.dto.BookTest;

@Repository
public interface BookTestDao extends CrudRepository<BookTest, Integer> {

}