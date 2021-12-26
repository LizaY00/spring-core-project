package by.itechart.yavlash;

import by.itechart.yavlash.config.ApplicationConfiguration;
import by.itechart.yavlash.report.MovieReport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        MovieReport report = context.getBean(MovieReport.class);
        report.generate();
    }
}