/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
October 20, 2026
https://www.drbasit.org/cs102/

A Recursive program find power (x, y)
*/
package Generics.G2;

public class R9 {
    public static void main(String [] args){
        int x = 2;
        int y = 16;
        int p = pow(x, y);
        System.out.println(x +"^"+ y + "=" + p);
        
    }
    
    public static int pow(int x, int y){
        if(y==0) // base case; 
            return 1;
        else // recursive case; 
        {
            return x * pow(x, y - 1);
        }
    }  
}

/*
Recursion TREE
pow (2, 4)          return 16
     |                     ^
     \/                    |
2 * pow (2, 3)     = 2 * 8= 16
     |                     ^
     \/                    |
2 * pow (2, 2)     = 2 * 4 = 8
     |                     ^
     \/                    |
2 * pow (2, 1)     = 2 * 2 = 4
     |                     ^
     \/                    |
2 * pow (2, 0)     = 2 * 1 = 2     
     |                     ^
     \/                    1
Base case:                 ^
STOP return 1 -------------|


*/
