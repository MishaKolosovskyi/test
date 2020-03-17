package com.task.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.task.dao.ReviewDao;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReviewDaoImpl implements ReviewDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ReviewDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<String> getMostActiveUsers() {
        String sqlQuery = "SELECT PROFILENAME, count(*) AS ACTIVE FROM TEST " +
                "GROUP BY PROFILENAME " +
                "ORDER BY ACTIVE DESC " +
                "LIMIT 1000;";
        return new ArrayList<>(jdbcTemplate.queryForList(sqlQuery, String.class));
    }

    @Override
    public List<Integer> getMostCommentedFood() {
        String sqlQuery = "SELECT PRODUCTID, count(*) AS MOSTCOMMENTED FROM TEST " +
                "GROUP BY PRODUCTID " +
                "ORDER BY MOSTCOMMENTED DESC " +
                "LIMIT 1000;";
        return new ArrayList<>(jdbcTemplate.queryForList(sqlQuery, Integer.class));
    }

    @Override
    public List<String> getMostUsedWords() {
        String sqlQuery = "SELECT Text FROM TEST";
        
          //select TEXT, count(*) from TEST
        //where TEXT is not null
        //  and TEXT NOT IN ('', 'and', 'for', 'of', 'on')
        //group by TEXT
        //order by count(*) desc
        //limit 1000;
        
        return null;
    }
}
