package com.task.dao;

import java.util.List;

public interface ReviewDao {
    List<String> getMostActiveUsers();
    List<Integer> getMostCommentedFood();
    List<String> getMostUsedWords();
}
