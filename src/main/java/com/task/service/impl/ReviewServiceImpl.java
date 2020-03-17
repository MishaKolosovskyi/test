package com.task.service.impl;

import com.task.dao.ReviewDao;
import com.task.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewDao reviewDao;

    @Autowired
    public ReviewServiceImpl(ReviewDao reviewDao) {
        this.reviewDao = reviewDao;
    }

    @Override
    public List<String> getMostActiveUsers() {
        return reviewDao.getMostActiveUsers();
    }

    @Override
    public List<Integer> getMostCommentedFood() {
        return reviewDao.getMostCommentedFood();
    }

    @Override
    public List<String> getMostUsedWords() {
        return reviewDao.getMostUsedWords();
    }
}
