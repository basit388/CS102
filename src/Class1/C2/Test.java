package Class1.C2;

public class Test 
{
    public static void main(String [] s)
    {
        Person man = new Person();
        
        //man.ID = 10; // NOT ALLOWED (private)
        
        man.setID(10);
        man.Name = "Ahmed";
        
        System.out.println("ID: "+ man.getID());
        System.out.println("Name: "+ man.Name);
        
        //person child
        Person child = new Person();
        child.setID(1001);
        child.Name = "Saleh Ahmed";
        
        System.out.println("ID: "+ child.getID());
        System.out.println("Name: "+ child.Name);
        
        //using overloaded constructor
        Person baby = new Person(99, "Ali");
        System.out.println("ID: "+ baby.getID());
        System.out.println("Name: "+ baby.Name);        
        
        
    }
    
}
