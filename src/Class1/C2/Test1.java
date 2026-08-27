package Class1.C2;

public class Test1 
{
    public static void main(String [] s)
    {
        int x = 10;
        int y;
        y = 10;
        
        //primative data types can be copied!
        System.out.println("x: " + x + "y: " + y);
        System.out.println();
        
        
        //object data type copying is different??
        Person Robot1 = new Person();
        Robot1.setID(101);
        Robot1.Name = "Robo-01";

        System.out.println(Robot1);
        System.out.println(Robot1.getID() + ": " + Robot1.Name);
        System.out.println();
        Person Robot2;
        
        //Lets see if we can copy Robot2 to Robot1
        Robot2 = Robot1;

        System.out.println(Robot2);
        System.out.println(Robot2.getID() + ": " + Robot2.Name);
        System.out.println();
       
        //Robot2 is NOT a copy of Robot1 !!
        //To make copy of Robot
        //use copy constructor
        
        Robot2 = new Person(Robot1);
        System.out.println(Robot2);
        System.out.println("ID: "+ Robot2.getID());
        System.out.println("Name: "+ Robot2.Name);

        //make CLONES of Robot
        Person Robot3, Robot4, Robot5;
        Robot3 = new Person(Robot1);
        Robot4 = new Person(Robot1);
        Robot5 = new Person(Robot1);
        
        //but they all have the same ID!!
        System.out.println("ID Robot2: "+ Robot2.getID());
        System.out.println("ID Robot3: "+ Robot3.getID());
        System.out.println("ID Robot4: "+ Robot4.getID());
        System.out.println("ID Robot5: "+ Robot5.getID());
        
        //and the same Name!!
        
    }
    
}
