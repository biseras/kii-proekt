package com.example.film.services;

import com.example.film.domain.models.Film;
import com.example.film.services.form.FilmForm;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    Film findById(Long id);
    Optional<Film> createFilm(FilmForm form);
    List<Film> getAll();
}
