package Class1.Ex5;
/*
Attributes: All fields must be private.
• reactionName: String
• element1 : Element
• element2 : Element

Constructors
1. Parameterized constructor
ChemicalReaction(String reactionName, Element e1, Element e2)
2. Copy constructor
ChemicalReaction(ChemicalReaction other)Creates a deep copy of the
reaction (copies elements using their copy constructors).

Methods
• Getters and setters, with the following validation :
o If e1 or e2 is null, replace it with a default Element(Use default constructor)
o If reactionName is null or empty, replace it with “RX”
• Method getInfo(): inputs nothing, returns a string in the following format:
Reaction[<reactionName>, element1 + element2]
For example: Reaction[Combustion, O(16.0g) + H(2.0g)]


*/
public class ChemicalReaction {
    
}
