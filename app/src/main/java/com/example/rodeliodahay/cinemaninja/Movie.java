package com.example.rodeliodahay.cinemaninja;

class Movie {
    private String name, description, director, image, url;
    private int numberOfView;

    Movie(String name, String description, String director, int numberOfView, String image, String url){
        super();
        this.name = name;
        this.description = description;
        this.director = director;
        this.numberOfView = numberOfView;
        this.image = image;
        this.url = url;
    }

    String getName(){
        return this.name;
    }

    String getDescription(){
        return this.description;
    }

    String getDirector(){
        return this.director;
    }

    int getnumberOfviews(){
        return this.numberOfView;
    }
    String getImage(){
        return this.image;
    }
    String getUrl(){ return this.url; }
}
