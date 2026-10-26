/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

Generics using type extends
<T extends Number>: Restricts T to only work with 
  numeric types like Integer, Double, or Float

*/
package Generics.G1;

class Item <T extends Number>{
    T [] Arr;

    Item(T [] a){
        Arr = a;
    }
    double Average(){
        double sum = 0;
        for(int i=0;i<Arr.length;i++)
            sum += Arr[i].doubleValue();
        return sum/Arr.length;
    }   
}
 

public class G5 {
    
    public static void main(String [] args){
        
        Double [] dArr = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};

        Item <Double> d = new Item<>(dArr);
         
        System.out.println(d.Average());
        
        
        Integer [] iArr = {1,2,3,4,5,6};

        Item <Integer> i = new Item<>(iArr);
          
        System.out.println(i.Average());        
        
    }
}
