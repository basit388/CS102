package Class1.Lab3.Ex3;

/*
Exercise 3
Write a class Robot with the following details:
-Add two attributes/variables 
  private int charge
  static int count
-Write two constructors with and without parameters. 
  set the values for charge. 
  increment count.
-Write a copy-constructor
  it copies all variables
-Write a setter method that sets charge.
  charge value must be 0<=charge<=100; otherwise throw exception
-Write a getter method for charge
-Write a toString() method that returns a string

 */
public class Robot {

    private int charge;
    static int count;

    Robot() {
        charge = 0;
        count++;
    }

    Robot(int c) {
        charge = c;
        count++;
    }

    Robot(Robot R) {
        if (R != null) {
            this.charge = R.charge;
            count++;
        }
    }

    public void setCharge(int c) {
        if (c < 0 || c > 100) {
            throw new IllegalArgumentException
                ("Error: value must be between 0 and 100");
        }
        charge = c;
    }
    public int getCharge(){
        return charge;
    }
    public String toString(){
        return "charge: " + charge;
    }
            
}
