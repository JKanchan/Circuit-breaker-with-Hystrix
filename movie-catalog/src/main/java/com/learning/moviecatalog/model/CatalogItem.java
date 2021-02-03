package com.learning.moviecatalog.model;

public class CatalogItem {
    private String name;
    private String description;
    private int rating;

    public CatalogItem() {
    	
    }
    public CatalogItem(String name, String desc, int rating) {
        this.name = name;
        this.description = desc;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
