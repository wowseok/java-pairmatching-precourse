package domain.crew;

import domain.course.Course;
import java.util.ArrayList;
import java.util.List;

public class Crew {
    private static List<Crew> allCrews = new ArrayList<>();
    private Course course;
    private String name;

    public Crew(Course course, String name) {
        this.course = course;
        this.name = name;
        addToAllCrews(this); // 생성된 객체를 리스트에 추가
    }

    // 모든 Crew를 관리하는 메서드
    private static void addToAllCrews(Crew crew) {
        allCrews.add(crew);
    }


    // 전체 크루 리스트 반환
    public static List<Crew> getAllCrews() {
        return new ArrayList<>(allCrews);
    }


}
