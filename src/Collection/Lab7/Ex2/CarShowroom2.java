/*
Instructions:
1. Create class CarShowroom2
2. Variables:
    None
3. Methods
    None
*/
package Collection.C8;


public class CarShowroom2 
{
    public static void main(String [] args){
    
        //create a LinkedHashSet of Cars
        //Add the following to the LinkedHashSet
        /*
        | Model   | Brand   | Price (SAR) |
        | ------- | ------- | ----------: |
        | Camry   | Toyota  |      115000 |
        | Corolla | Toyota  |       82000 |
        | RAV4    | Toyota  |      125000 |
        | Accord  | Honda   |      119000 |
        | Civic   | Honda   |       89000 |
        | Patrol  | Nissan  |      235000 |
        | X-Trail | Nissan  |      110000 |
        | Tucson  | Hyundai |      105000 |
        | Elantra | Hyundai |       82000 |
        | Model 3 | Tesla   |      165000 |
        | Model Y | Tesla   |      195000 |
        | Camry   | Toyota  |      115000 |

        
        */
        
        //Display all cars in the set.
        //Is there a difference between this and HashSet output
        //Check if there are any duplicates?
        
        
        //Add the following cars to your LinkedHashSet:
        /*
            Toyota - Camry - 115000
            Toyota - Camry - 115000
            Toyota - Camry - 120000
            Honda - Camry - 115000
        */
        
        //Are these cars different?
        //Toyota - Camry - 115000
        //Toyota - Camry - 120000
        
        //Do set operations
        
        //A. Union
        //Determine all cars available after combining:
        //Original showroom + New shipment
        //Hint: Use addAll();
        
        //B. Intersection
        //Determine which cars are present in both:
        //Original showroom + New shipment
        //Hint: Use retainAll()
                
        //C. Difference
        //Determine which cars are in the new shipment but were not already in the showroom.        
        //Hint: Use removeAll()
        
        
        
        
    }
}