package com.stackroute.unittest.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public List<Student> studentInfo() {
        Student obj1 = new Student(1, "Abhishek", 23);
        Student obj2 = new Student(3, "Anjali", 25);
        Student obj3 = new Student(2, "Vaibhav", 27);
        Student obj4 = new Student(4, "Ishu", 23);
        Student obj5 = new Student(5, "Kishlay", 24);
        List<Student> list = new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);

        Collections.sort(list, new StudentSorter());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());
        }
        return list;
    }
}
