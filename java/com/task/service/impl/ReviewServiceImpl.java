package com.task.service.impl;

import com.task.repository.ReviewRepository;
import com.task.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<String> getMostActiveUsers() {
        return reviewRepository.getMostActiveUsers();
    }

    @Override
    public List<Integer> getMostCommentedFood() {
        return reviewRepository.getMostCommentedFood();
    }

    @Override
    public List<String> getMostUsedWords() {
        return reviewRepository.getMostUsedWords();
    }
}
