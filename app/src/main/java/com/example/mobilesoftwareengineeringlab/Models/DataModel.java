package com.example.mobilesoftwareengineeringlab.Models;

public class DataModel{
    private String title;
    private String description;
    private String imageURL;

    public DataModel(String title, String description, String imageURL){
        this.title = title;
        this.description = description;
    }

    public String getTitle(){
        return  title;
    }

    public String getImageURL(){
        return  title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setImageURL(String title){
        this.imageURL = imageURL;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}