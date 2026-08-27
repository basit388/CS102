package Arrays2D;
import java.io.*;
import java.util.Scanner;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Exercise 2
Write a program that finds the nearest Uber ride.
Read a text file that gives the x,y coordinates of each Uber ride on a 2D plane.
Store this information in a 2D array. Ask the user to enter his current 
location (x,y). Find the Uber ride closest to you!

Hint: distance = Math.hypot(x2 - x1, y2 - y1);
(x1,y1) and (x2,y2) are two points in a 2D plane.

*/


public class EXArray2D2 {
    public static void main(String [] s) throws FileNotFoundException
    {
        //TO DO: Make a 2D array of type double
        double [][] D = new double[10][2];
        
        
        //Open the file "E2.txt" and read the contents in the array

        
        
        //Ask user to input his current x,y coordinates.

        
        //For each row in the array, call the computeDistance method

        
        //Find the shortest distance and display the ride #

        
    }
    
    public static double computeDistance(double x1, double y1,double x2, double y2)
    {
        return Math.hypot(x2 - x1, y2 - y1);        
    }
}
