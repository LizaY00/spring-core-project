package by.itechart.yavlash.repository.impl;

import by.itechart.yavlash.model.Movie;
import by.itechart.yavlash.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class DbMovieRepository implements MovieRepository {
    @Override
    public List<Movie> findAll() {
        return new ArrayList<>() {{
            add(new Movie("The Killer", "Action"));
            add(new Movie("Lawrence of Arabia", "Adventure"));
            add(new Movie("Chicken Run", "Animated"));
            add(new Movie("Rush Hour films", "Comedy"));
            add(new Movie("Space Jam", "Animated"));
            add(new Movie("Doubt", "Drama"));
            add(new Movie("Raiders of the Lost Ark", "Adventure"));
            add(new Movie("Yojimbo", "Adventure"));
            add(new Movie("Midnight Cowboy", "Drama"));
            add(new Movie("First Reformed", "Drama"));
        }};
    }
}