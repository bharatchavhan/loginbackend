package com.neosoft.task.poc.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neosoft.task.poc.model.QSUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.task.poc.model.Experience;
import com.neosoft.task.poc.repository.Repo;
@Service
public class ServiceImpl implements CategoryService{



	@Autowired
	Repo repo;
@Override
  public QSUser getUser(String username) {
    QSUser user= repo.findByuserName(username);
    return user;
  }
/*	@Override
	public Experience saveCategory(Experience category) {

		return repo.save(category);
	}

	@Override
	public List<Experience> getAll() {

		return repo.findAll();
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

	    HttpServletRequest request = (HttpServletRequest) req;
	    HttpServletResponse response = (HttpServletResponse) res;

	    response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
	    response.setHeader("Access-Control-Allow-Credentials", "true");
	    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
	    response.setHeader("Access-Control-Max-Age", "3600");
	    response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");

	    chain.doFilter(req, res);
	}

	@Override
	public Experience getbyId(int id) {
		return repo.findById(id);
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		return repo.deleteById(id);
	}

	@Override
	public List<Experience> getByExperience(String exp) {

		return repo.findByExperience(exp);
	}*/
}



