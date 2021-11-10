package com.company;

import com.company.Task2.StreamTask2;
import com.company.Task1.StreamTask1;
import com.company.Task3.StreamTask3;

public class Main {

    public static void main(String[] args) {
        StreamTask1 task1 = new StreamTask1();
        task1.fillStudents();

        task1.showStudentsAndRating();

        System.out.println(task1.calcAverageMark("Biology"));

        System.out.println("\n \n");

        StreamTask2 task2 = new StreamTask2();

        System.out.println(task2.findFirstFiveReadingTask());

        System.out.println("\n \n");

        StreamTask3 task3 = new StreamTask3();

        System.out.println(task3.converter(task2.tasks));
    }
}
