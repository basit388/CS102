/*
Instructions:
1. Create class Zoo2
2. Variables:
    None
3. Methods
    None
*/
package Collection.C8;


public class Zoo2 
{
    public static void main(String [] args){
    
        //Create a PriorityQueue<Animal>
        
        //Use a Comparator so that animals with the lowest priority number are processed first.
        //Priority 1 → first
        //Priority 2 → second
        //Priority 3 → third
        //Priority 4 → last
        
        /*
            Add these animal to the PriorityQueue
        |  ID | Name  | Species  | Age | Priority |
        | --: | ----- | -------- | --: | -------: |
        | 101 | Simba | Lion     |   5 |        2 |
        | 102 | Max   | Dog      |   3 |        3 |
        | 103 | Leo   | Leopard  |   7 |        1 |
        | 104 | Coco  | Parrot   |   2 |        4 |
        | 105 | Rocky | Tiger    |   6 |        1 |
        | 106 | Luna  | Cat      |   4 |        3 |
        | 107 | Bella | Elephant |  12 |        2 |

        */ 
        
        //display the animal with the priority 1 use peek()
        
        // run loop to poll animals with priority 1 then 2 and then 3.
        
        /* add a new animal
        ID: 108
        Name: Thor
        Species: Bear
        Age: 4
        Priority: 1
        */
        
        //check which animal should be treated first
        
        //write a new comparator on age.
        
        //list all animals ordered by age (youngest comes first)
    }
}