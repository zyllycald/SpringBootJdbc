package com.zy.SptingBootJdbc.service.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.zy.SptingBootJdbc.service.UserService;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void creat(String name, int age) {
		jdbcTemplate.update("insert into USER(NAME, AGE) values(?, ?)", name, age);
	}

	@Override
	public void deleteByUser(String name) {
		jdbcTemplate.update("DELETE FROM USER WHERE NAME = ?" , name);

	}

	@Override
	public void deleteAllUser() {
		jdbcTemplate.update("DELETE FROM USER");

	}

	@Override
	public Integer getAllUsers() {
		return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM USER", Integer.class);
	}

}
