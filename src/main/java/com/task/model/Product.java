package com.task.model;

public class Product {
    private Long id;
    private Comment comment;

    public Product(Long id, Comment comment) {
        this.id = id;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", comment=" + comment +
                '}';
    }
}
