package Class1.Lab4.Ex2;
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
    private String symbol;
    private double weight;
    private final String DEFAULT_SYMBOL = "X";
    static final double MAX_WEIGHT = 500.0;
    
    Element(){
        symbol = DEFAULT_SYMBOL;
        weight = 0;
    }
    Element(String symb, double w){
        symbol = symb;
        weight = w;
    }
    Element(Element e){
        if(e !=null){
            this.symbol = e.symbol;
            this.weight = e.weight;
        }
        else{
            this.symbol = DEFAULT_SYMBOL;
            this.weight = 0;
        }
    }
    public String getSymbol(){
        return symbol;
    }
    public double getWeight(){
        return weight;
    }
    public void setSymbol(String s){
        if(s==null || s =="")
            this.symbol = DEFAULT_SYMBOL;
        this.symbol = s;
    }
    public void setWeight(double d){
        if(weight < 0 || weight > MAX_WEIGHT)
            this.weight=0;
        else
            this.weight = d;
    }

    public String getInfo(){
        return symbol + "(" + weight +"g)";
    }
            
}
