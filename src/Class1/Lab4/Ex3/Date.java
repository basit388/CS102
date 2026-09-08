package Class1.Lab4.Ex3;
/*
Exercise 5
Class Date is given with the following details:
- private int day, month and year
- default and parameterized constructor
- a equals method that compares dates

- write toString method
- write a setter method that sets all three values
- write a equals method to test if two dates objects are equal

*/
public class Date {
    private int d;
    private int m;
    private int y;
    Date()
    {
        d=1;
        m=1;
        y=1970;
    }
    Date(int D, int M, int Y)
    {
        d=D;
        m=M;
        y=Y;        
    }
    Date(Date other){
        this.d=other.d;
        this.m=other.m;
        this.y=other.y;
    }
    
    @Override
    public boolean equals(Object obj) {

        // Check if both references point to the same object
        if (this == obj)
            return true;

        // Check if obj is not a Date object
        if (!(obj instanceof Date))
            return false;

        Date other = (Date) obj;

        // Compare the contents
        return d == other.d &&
               m == other.m &&
               y == other.y;
    }
    public void setDate(int d, int m, int y){
        this.d=d;
        this.m=m;
        this.y=y;
    }
}
