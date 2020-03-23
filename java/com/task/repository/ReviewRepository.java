package com.task.repository;

import com.task.model.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

    @Query(value = "SELECT PROFILENAME, count(*) AS ACTIVE FROM TEST " +
            "GROUP BY PROFILENAME " +
            "ORDER BY ACTIVE DESC " +
            "LIMIT 1000;", nativeQuery = true)
    List<String> getMostActiveUsers();

    @Query(value = "SELECT PRODUCTID, count(*) AS MOSTCOMMENTED FROM TEST " +
            "GROUP BY PRODUCTID " +
            "ORDER BY MOSTCOMMENTED DESC " +
            "LIMIT 1000;", nativeQuery = true)
    List<Integer> getMostCommentedFood();

    //TODO
    //SELECT TEXT, count(*) FROM TEST
    //WHERE TEXT IS NOT null
    //GROUP BY TEXT
    //ORDER BY count(*) DESC
    //LIMIT 1000;
    List<String> getMostUsedWords();
}
