package com.neosoft.task.poc.repository;

import java.util.List;

import com.neosoft.task.poc.model.QSUser;
import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.task.poc.model.Experience;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<QSUser, String>{

  QSUser findByuserName(String username);

//	Experience findById(int id);
//
//	String deleteById(int id);
//
//	List<Experience> findByExperience(String exp);
}
