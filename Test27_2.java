package SoloTest.TEST;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Student {
    public enum Gender {Male, Female};
    private String name;
    private int score;
    private Gender gender;

    public Student(String name, int score, Gender gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public Gender getGender(){
        return gender;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }
}

public class Test27_2 {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("김코딩", 10, Student.Gender.Male),
                new Student("김인기", 8, Student.Gender.Male),
                new Student("이자바", 9, Student.Gender.Female),
                new Student("최민선", 10, Student.Gender.Female)
        );

        List<Student> maleList = totalList.stream()
                .filter(s -> s.getGender() == Student.Gender.Male)
                .collect(Collectors.toList());

        maleList.stream().forEach(n->System.out.println(n.getName()));

        System.out.println("================================================");

        Set<Student> femaleSet = totalList.stream()
                .filter(s -> s.getGender() == Student.Gender.Female)
                .collect(Collectors.toCollection(HashSet:: new));

        femaleSet.stream().forEach(n->System.out.println(n.getName()));
    }
}
