package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    StudentMain obj;
    @Before
    public void setUp() throws Exception {
        obj = new StudentMain();
    }

    @After
    public void tearDown() throws Exception {
    obj = null;
    }

    @Test
    public void studentInfo() {
        Student obj1 = new Student(1, "Abhishek", 23);
        Student obj2 = new Student(3, "Anjali", 25);
        Student obj3 = new Student(2, "Vaibhav", 27);
        Student obj4 = new Student(4, "Ishu", 23);
        Student obj5 = new Student(5, "Kishlay", 24);
        List<Student> list=new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        List<Student> ans=obj.studentInfo();
        String expected="",actual="";
        for(int i=0;i<list.size();i++) {
            expected+=list.get(i).getId()+" "+list.get(i).getName()+" "+list.get(i).getAge()+" ";
        }
        for(int j=0;j<ans.size();j++){
            actual+=ans.get(j).getId()+" "+ans.get(j).getName()+" "+ans.get(j).getAge()+" ";

        }
        assertEquals(expected,actual);
    }
}