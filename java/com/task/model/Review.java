package com.task.model;

import lombok.Data;
import javax.persistence.Table;

@Data
@Table(name = "review")
public class Review {
    private Long id;
    private String productId;
    private String userId;
    private String profileName;
    private int helpfulnessNumerator;
    private int helpfulnessDenominator;
    private int score;
    private String time;
    private String summary;
    private String text;
}
