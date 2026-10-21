/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Generics using type extends
<T extends Comparable>: Comparable class

*/
package Generics.G1;

class Student implements Comparable<Student> {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }
}

public class G7 {
    
    public static <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) > 0)
            return a;
        else
            return b;
    }    
    public static void main(String [] args){

        Student s1 = new Student(75);
        Student s2 = new Student(90);

        Student best = max(s1, s2);

        System.out.println(best.marks); // 90
        
    }
}
