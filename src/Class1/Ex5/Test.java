package Class1.Ex5;

/*
Run the program
*/

public class Test {
    
    public static void main(String[] args) {
        Element e1 = new Element("O", 16);
        Element e2 = new Element("H", 2);
        ChemicalReaction RX1 = new ChemicalReaction("Combustion", e1, e2);
        ChemicalReaction RX2 = new ChemicalReaction(RX1);
        e1.setWeight(20);
        RX2.setElement1(e1);
        System.out.println(RX1.getInfo());
        System.out.println(RX2.getInfo());
        
        
        
    }
}
    

