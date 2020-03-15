package com.task.service;

import java.util.List;

public interface ReviewsService {
    List<String> getMostActiveUsers();
    List<Integer> getMostCommentedFood();
    List<String> getMostUsedWords();
}
