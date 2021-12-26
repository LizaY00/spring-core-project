package by.itechart.yavlash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import by.itechart.yavlash.report.MovieReport;
import by.itechart.yavlash.repository.MovieRepository;
import by.itechart.yavlash.repository.impl.DbMovieRepository;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public MovieRepository movieRepository() {
        return new DbMovieRepository();
    }

    @Bean
    public MovieReport movieReport() {
        return new MovieReport(movieRepository());
    }
}