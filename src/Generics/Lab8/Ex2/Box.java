/*
Instructions:
1. Create class Box type T that extends Number
2. Variables:
     make an array of type T called item

3. Methods
    Constructor with parameter; 
    Appropraite getters 
    Write a setter that takes two parameters of type T and int. T is to be inserted at position int
    Overloaded toString method that return all the contents of item
    A sum method that returns a Integer as the sum of all values in item
    A avg method that returns a Double as the average of all values in item

*/
package Generics.Lab8.Ex2;


public class Box <T extends Number>
{
    T [] item;
    
}
