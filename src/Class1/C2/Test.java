package Class1.C2;

public class Test 
{
    public static void main(String [] s)
    {
        Person man = new Person();
        Person Ali = new Person();
        
        man.setID(100);
        Ali.setID(200);
        
        man.setName("Ahmed");
        Ali.setName("Ali");
        
        
        Person Mohammad =new Person(Ali);
        
        //man.ID = 10; // NOT ALLOWED (private)
        
        man.setID(10);
        
        //man.Name = "Ahmed";
        man.setName("Ahmed");
        
        System.out.println(man.getName());
        System.out.println(man.getID());
        
        Person child = new Person(10,"Ali");
        
        System.out.println(child.getID());
        System.out.println(child.getName());
        
        Person child2 = new Person(child);
        
        System.out.println(child2.getID());
        System.out.println(child2.getName());

         System.out.println("ID: "+ man.getID());
        //System.out.println("Name: "+ man.Name);
        
        //person child
        Person child1 = new Person();
        child1.setID(1001);
        child1.setName( "Saleh Ahmed");
        
        System.out.println("ID: "+ child.getID());
        System.out.println("Name: "+ child1.getName());
        
        //using overloaded constructor
        Person baby = new Person(99, "Ali");
        System.out.println("ID: "+ baby.getID());
        System.out.println("Name: "+ baby.getName());        
        
        
    }
    
}
