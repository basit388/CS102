/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
September 15, 2026
https://www.ieeepsu.org/basit/cs102/

// class Books
*/
package Class3.C4;

public class Books implements Comparable{
    public String name;
    public int year;

    public Books(String name, int year) {
        this.name = name;
        this.year = year;
    }
    
    @Override
    public int compareTo(Object o){
        Books other = (Books)o;
        
        int r;
        r = name.compareTo(other.name);
     // r = year - other.year;
        
        return r;
        
    }

}
