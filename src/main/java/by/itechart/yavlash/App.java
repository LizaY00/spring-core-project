package by.itechart.yavlash;

import by.itechart.yavlash.report.MovieReport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        MovieReport report = context.getBean(MovieReport.class);
        report.generate();
    }
}