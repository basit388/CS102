
package Generics.Lab8.Ex4;

public class Test6 {
    public static void main(String [] args){
        int [] A = {1,2,3,4,5,6};
        System.out.println("BEFORE");
        for(int e: A)
            System.out.print(e +" ");
        
        System.out.println();
        
        reverseArray(A, 0, A.length-1);

        System.out.println("AFTER");
        for(int e: A)
            System.out.print(e+" ");
        
    }
    
    //write a recursive method that takes a integer array as a parameter
    //this method reverses all the values in the array.
    //Example {1,2,3} will become {3,2,1}
    
    public static void reverseArray(int [] A, int i, int j)
    {
        if(i>=j)
            return;
        else
        {

        }
    }
}
