package pairmatching.util;

import domain.course.Course;
import domain.crew.Crew;

public class StringParser {

    public static void parseFileContent(Course course, String input) {
        String[] lines = input.split("\r\n");
        for (String str : lines) {
            new Crew(course, str);
        }
    }
}
