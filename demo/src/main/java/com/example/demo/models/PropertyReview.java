package com.example.demo.models;

public class PropertyReview {
    public int id;
    public String comments;
    
    public PropertyReview(){}

    public PropertyReview(int id, String comments) {
        this.id = id;
        this.comments = comments;
    }

    public int getId() {
        return this.id;
    }

    public String getComments() {
        return this.comments;
    }
  
}

  @PrimaryGeneratedColumn()
  id: number;

  @Column()
  comments: String;