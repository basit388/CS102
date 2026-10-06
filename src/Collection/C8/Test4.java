/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 2, 2026
https://www.ieeepsu.org/basit/cs102/

//Tester class 
*/
package Collection.C8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "("+name+", "+age+")";
    }
    
}

public class Test4 
{
    public static void main(String [] args){
    
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ali", 22));
        students.add(new Student("Sara", 20));
        students.add(new Student("Ahmed", 24));
        
        System.out.println(students);
        
        Comparator<Student> d_byName = new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return s2.name.compareTo(s1.name);
            }
        };
          
        Collections.sort(students, d_byName);
        System.out.println(students);
        
    }
}
