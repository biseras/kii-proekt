package com.example.film.services.form;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;

@Data
public class FilmForm {
    private String filmName;
    //private Kvalitet kvalitet;
    private int numadded;
    private int price;
}
