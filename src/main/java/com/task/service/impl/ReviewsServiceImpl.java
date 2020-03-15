package com.task.service.impl;

import com.task.dao.ReviewsDao;
import com.task.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewsServiceImpl implements ReviewsService {

    private final ReviewsDao reviewsDao;

    @Autowired
    public ReviewsServiceImpl(ReviewsDao reviewsDao) {
        this.reviewsDao = reviewsDao;
    }

    @Override
    public List<String> getMostActiveUsers() {
        return reviewsDao.getMostActiveUsers();
    }

    @Override
    public List<Integer> getMostCommentedFood() {
        return reviewsDao.getMostCommentedFood();
    }

    @Override
    public List<String> getMostUsedWords() {
        return reviewsDao.getMostUsedWords();
    }
}
