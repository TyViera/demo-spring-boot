package com.travelport.demospringboot.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

  private final JdbcTemplate jdbcTemplate;

  public UserDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public void selectAll(){
    jdbcTemplate.query("select * from table", (rs, rowNum) -> rs.getString("column"));
  }

}
