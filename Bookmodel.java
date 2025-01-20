/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookis.model;


/**
 *
 * @author ajita
 */
public class Bookmodel {
    
    
    private String name;
    private int isbn;
    private int publishedYear;
    private int price;
    private String genre;
    
    public Bookmodel(){
        
    }
    
    public Bookmodel(String name, int isbn, int publishedYear, int price, String genre){
        this.name = name;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
        this.price = price;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public int getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
}
