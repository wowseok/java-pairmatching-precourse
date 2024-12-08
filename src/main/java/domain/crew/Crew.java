package domain.crew;

import camp.nextstep.edu.missionutils.Randoms;
import domain.course.Course;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crew {
    private static List<String> backCrews = new ArrayList<>();
    private static List<String> frontCrews = new ArrayList<>();
    private Course course;
    private final String name;

    public Crew(Course course, String name) {
        this.course = course;
        this.name = name;
        addCrews(this); // 생성된 객체를 리스트에 추가
    }

    // 모든 Crew를 관리하는 메서드
    private static void addCrews(Crew crew) {
        checkCourse(crew);
    }

    private static void checkCourse(Crew crew) {
        if (crew.course == Course.BACKEND) {
            backCrews.add(crew.name);
        }

        if (crew.course == Course.FRONTEND) {
            frontCrews.add(crew.name);
        }
    }

    public static void PairMatching(Course course) {
        if (course == Course.BACKEND) {
            matching(backCrews);
        }
        if (course == Course.FRONTEND) {
            matching(frontCrews);
        }


    }

    private static void matching(List<String> crews) {
        List<String> shuffledCrew = Randoms.shuffle(crews); // 섞인 크루 이름 목록
        List<List<String>> pairs = new ArrayList<>();
        for (int i = 0; i < shuffledCrew.size(); i += 2) {

            if (i + 1 < shuffledCrew.size()) {
                pairs.add(Arrays.asList(shuffledCrew.get(i), shuffledCrew.get(i + 1)));
            } else {
                pairs.add(Arrays.asList(shuffledCrew.get(i))); // 홀수일 경우 마지막 단독 추가
            }
        }
        for (List<String> pair : pairs) {
            System.out.println(pair);
        }
    }


}
