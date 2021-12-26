package by.itechart.yavlash.repository;

import by.itechart.yavlash.model.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> findAll();
}