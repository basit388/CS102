/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

//This teaches comparable
*/
package Class3.C4;

public class Test {
    public static void main(String[] args) {
        
        int x=3;
        int y=4;
        
        double a=3.0;
        double b=4.0;
        
        String fname="Ahmed";
        String lname="Hisham";
        
        //compare x and y (same type)
        if(x > y){
            System.out.println("x > y");
        }
        //compare a and b (same type)
        if(a > b){
            System.out.println("a > b");
        }        
        //compare fname and lname (same type)
        /*
        if(fname > lname){
            System.out.println("fname > lname");
        }       
        
            Why is this a problem??
            String is a object data type; need to define
            a comparable / comparator
            
        */
        fname.compareTo(lname);
        
        
    }
}