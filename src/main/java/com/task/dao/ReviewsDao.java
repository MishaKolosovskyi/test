package com.task.dao;

import java.util.List;

public interface ReviewsDao {
    List<String> getMostActiveUsers();
    List<Integer> getMostCommentedFood();
    List<String> getMostUsedWords();
}
