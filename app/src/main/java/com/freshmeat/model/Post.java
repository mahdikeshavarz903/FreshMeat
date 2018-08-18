package com.freshmeat.model;

import android.widget.ImageView;

public class Post
{
    private int postId;
    private ImageView imageView;
    private Schedule schedule;
    private String title;
    private String description;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public ImageView getImage() {
        return imageView;
    }

    public void setImage(ImageView image) {
        this.imageView = image;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
