package Arrays2D;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
==========================2026 (c) Basit Qureshi ===========================

CS102 Programming II
Dept. of Computer Sc, Prince Sultan University
August 8, 2026
https://www.ieeepsu.org/basit/cs102/

//Exercise 3
Write a program that grades the scores of a multiple choice exam.
There are 10 questions in the exam. The possible answer for each question is
A, B, C, D. 

Ask the user to type 10 characters. Each character must be A, B, C or D. This 
is the correct answer KEY.

Read a text file "E3.txt" that gives the answers for students. Show
the total score for each student. Also show the average score, highest and
the lowest scores.

*/


public class EXArray2D3 {
    public static void main(String [] s)throws FileNotFoundException
    {
        //TO DO: Make a 2D array of type char
        
        //Ask user to input the correct answer and store it in KEY.
         
        //Open the file "E3.txt" and read the contents in the array
        
        
        //call getScore method. Compute the score for each row in Scores.
        
        //display the average, max and min scores.
        
    }
    
    
    public static int getScore(char [][] C, char [] KEY, int row)
    {
        //grade the score for the student in row

        //match each column value in C[row][col] with KEY[col]. If it is
        //identical, student eachs 1 pt.
        
        
        
        //return the sum

    }    
    
    public static int maxGrade(int [] G){
        int max = 0;
        for(int i=0;i<10;i++)
        {
            if(max < G[i])
                max = G[i];
        }
        return max;
    }

    public static int minGrade(int [] G){
        int min = 0;
        
        
        return min;
    }  
    
    public static double avgGrade(int [] G)
    {
        int sum = 0;
        
        
        return sum/10;
    }    
}
