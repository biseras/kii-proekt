package com.example.film.services.impl;

import com.example.film.domain.exception.FilmNotFound;
import com.example.film.domain.models.Film;
import com.example.film.domain.repository.FilmRepository;
import com.example.film.services.FilmService;
import com.example.film.services.form.FilmForm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FilmServiceImpl implements FilmService {
    private final FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public Film findById(Long id) {
        return filmRepository.findById(id).orElseThrow(FilmNotFound::new);
    }

    @Override
    public Optional<Film> createFilm(FilmForm form) {
        //Film f=Film.build(form.getFilmName(), form.getPrice(), form.getNumadded());
        Film f=new Film(form.getFilmName(), form.getPrice(), form.getNumadded());
        filmRepository.save(f);
        return Optional.of(f);
    }
    @Override
    public List<Film> getAll() {
        return filmRepository.findAll();
    }
}
