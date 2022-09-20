package com.example.film.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "film")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Film{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filmName;
    //private Kvalitet kvalitet;
    private int numadded=0;
    private int price;

    public Film(String filmName, int numadded, int price) {
        this.filmName = filmName;
        this.numadded = numadded;
        this.price = price;
    }

    public void addSales() {
        this.numadded = this.numadded +1;
    }

    public void removeSales() {
        this.numadded = this.numadded +1;
    }


}
