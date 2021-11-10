package com.company.Task1;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class StreamTask1 {
    List<Student> studentList;

    public void fillStudents() {
        studentList = List.of(
                new Student("Matvei"),
                new Student("Artem"),
                new Student("Ilya"),
                new Student("Vlad"),
                new Student("Valya"),
                new Student("Leonid")
        );

        studentList.forEach(s -> {
            s.rate("Math", ThreadLocalRandom.current().nextInt(1, 10))
                    .rate("History", ThreadLocalRandom.current().nextInt(1, 10))
                    .rate("Biology", ThreadLocalRandom.current().nextInt(1, 10))
                    .rate("Geography", ThreadLocalRandom.current().nextInt(1, 10));
        });
    }

    public void showStudentsAndRating() {
        studentList.forEach(s -> {
            System.out.println(s.name + " " + s.rating);
        });
    }

    public double calcAverageMark(String subject) {
        return studentList.stream()
                .map(s -> s.rating)
                .mapToInt(r -> r.get(subject))
                .average()
                .orElse(0.0);
    }
}
