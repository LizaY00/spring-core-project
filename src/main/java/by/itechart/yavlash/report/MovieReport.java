package by.itechart.yavlash.report;

import by.itechart.yavlash.repository.MovieRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MovieReport {
    private MovieRepository movieRepository;

    public void generate() {
        System.out.println(movieRepository.findAll());
    }
}