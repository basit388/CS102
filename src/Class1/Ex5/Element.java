package Class1.Ex5;
/*
Create a class named Element that represents a chemical 
element with a weight.

Attributes: All fields must be private.
• symbol: String
• weight: double
• DEFAULT_SYMBOL : final String = "X"
• MAX_WEIGHT : static final double = 500.0

Constructors
1. Default constructor
o Sets symbol to DEFAULT_SYMBOL
o Sets weight to 0.0
2. Parameterized constructor (to initialize symbol and weight)
o Calls the set methods
3. Copy constructor
o Creates a deep copy of the given element (copies the symbol and weight of
the other element)
o If the other is null, create a default element

Methods
• Getters and setters, with the following validation rules:
o If symbol is null or empty → use DEFAULT_SYMBOL
o If weight < 0 or weight > MAX_WEIGHT → set weight = 0
• Method getInfo(): inputs nothing, returns a string in the following format:
<symbol>(<weight>g). For example, H(16.0g)

*/
public class Element {
    
}
