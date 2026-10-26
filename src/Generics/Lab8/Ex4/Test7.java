
package Generics.Lab8.Ex4;

import java.util.ArrayList;

public class Test7 {
    public static void main(String [] args){
        
        ArrayList <Integer> Arr = new ArrayList<>();
        for(int i=0;i<10;i++)
            Arr.add(i);
    
        System.out.println("BEFORE");
        for(int e: Arr)
            System.out.print(e +" ");
        
        System.out.println();
        
        reverseArray(Arr, 0, Arr.size()-1);

        System.out.println("AFTER");
        for(int e: Arr)
            System.out.print(e+" ");
        
    }
    
    //write a recursive method that takes a integer arrayList as a parameter
    //this method reverses all the values in the arrayList.
    //Example {1,2,3} will become {3,2,1}
    //Hint: Use the set() and get() methods instead of add()
    
    public static void reverseArray(ArrayList <Integer> A, int i, int j)
    {
        if(i>=j)
            return;
        else
        { 

        }
    }
}
