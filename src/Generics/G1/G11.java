/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Using Generic Interface with bounded type
*/
package Generics.G1;

interface Calculator<T extends Number> {
    double add(T a, T b);
}

class BasicCalculator<T extends Number>
        implements Calculator<T> {

    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

public class G11 {
    
    public static void main(String [] args){

        Calculator<Integer> c1 = new BasicCalculator<>();
        System.out.println(c1.add(10, 20));  // 30.0

        Calculator<Double> c2 = new BasicCalculator<>();
        System.out.println(c2.add(2.5, 3.5)); // 6.0

        // Compilation error:
        // Calculator<String> c4 = new BasicCalculator<>();

    }
}
