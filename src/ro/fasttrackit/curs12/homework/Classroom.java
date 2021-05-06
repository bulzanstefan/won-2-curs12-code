package ro.fasttrackit.curs12.homework;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> grades = new ArrayList<>();

    public Classroom(List<StudentGrade> grades) {
        if (grades != null) {
            this.grades.addAll(grades);
        }
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade max = null;
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equals(discipline)
                    && (max == null
                    || studentGrade.getGrade() > max.getGrade())) {
                max = studentGrade;
            }
        }
        return max;
    }

    public StudentGrade getMaxGrade2Iter(String discipline) {
        //1 iteratie -> aflam nota maxima
        int maxGrade = findMaxGrade(discipline);
        //1 iteratie -> aflam studentii cu nota maxim
        return firstStudentWithGrade(maxGrade, discipline);
    }

    private StudentGrade firstStudentWithGrade(int searchGrade, String discipline) {
        for (StudentGrade grade : grades) {
            if (grade.getGrade() == searchGrade
                    && grade.getDiscipline().equals(discipline)) {
                return grade;
            }
        }
        return null;
    }

    private int findMaxGrade(String discipline) {
        int max = 0;
        for (int i = 0; i < grades.size(); i++) {
            StudentGrade studentGrade = grades.get(i);
            if (max < studentGrade.getGrade()
                    && studentGrade.getDiscipline().equals(discipline)) {
                max = studentGrade.getGrade();
            }
        }
        return max;
    }

    // 5 3 2 5 10 9 5
}
