package com.task.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.task.dao.ReviewsDao;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReviewsDaoImpl implements ReviewsDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ReviewsDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<String> getMostActiveUsers() {
        String sqlQuery = "SELECT ProfileName, count(*) FROM Reviews.csv " +
                "ORDER BY profileName ASC " +
                "LIMIT 1000";
        return new ArrayList<>(jdbcTemplate.queryForList(sqlQuery, String.class));
    }

    @Override
    public List<Integer> getMostCommentedFood() {
        String sqlQuery = "SELECT ProductId, count(*) FROM Reviews.csv" +
                "ORDER BY productId ASC" +
                "LIMIT 1000";
        return new ArrayList<>(jdbcTemplate.queryForList(sqlQuery, Integer.class));
    }

    @Override
    public List<String> getMostUsedWords() {
        String sqlQuery = "SELECT Text FROM Reviews.csv";
        return null;
    }
}
