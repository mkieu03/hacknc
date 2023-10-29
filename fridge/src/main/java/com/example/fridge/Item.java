package com.example.fridge;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double amount;
    private int expiration_year;
    private int expiration_month;
    private int expiration_day;

    public Item(String name, double amount, int expiration_year, int expiration_month, int expiration_day) {
        this.name = name;
        this.amount = amount;
        this.expiration_year = expiration_year;
        this.expiration_month = expiration_month;
        this.expiration_day = expiration_day;
    }

    // Getters and Setters for the fields

    public Long getId() {
        return id;
    }

    // No setId method for id as it is auto-generated

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getExpiration_year() {
        return this.expiration_year;
    }

    public void setExpiration_year(int year) {
        this.expiration_year = year;
    }

    public int getExpiration_month() {
        return this.expiration_month;
    }

    public void setExpiration_month(int month) {
        this.expiration_month = month;
    }

    public int getExpiration_day() {
        return this.expiration_day;
    }

    public void setExpiration_day(int day) {
        this.expiration_day = day;
    }
    
}
