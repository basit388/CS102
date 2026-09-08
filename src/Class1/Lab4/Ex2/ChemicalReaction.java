package Class1.Lab4.Ex2;
/*
Class name ChemicalReaction
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
    private String reactionName;
    private Element element1;
    private Element element2; 
    ChemicalReaction(String reactionName, Element e1, Element e2){
        this.reactionName = reactionName;
        this.element1 = new Element(e1);
        this.element2 = new Element(e2);
        
    }
    ChemicalReaction(ChemicalReaction other)
    {
        if(other!=null){
            this.reactionName=other.reactionName;
            this.element1 = new Element(other.element1);
            this.element2 = new Element(other.element2);
        }
    }
    public String getReactionName(){
        return reactionName;
    }
    public Element getElement(Element other)
    {
        return other;
    }
    public void setReactionName(String s){
        if(s==null || s==""){
            this.reactionName = "RX";
        }
        else
            this.reactionName = s;
    }
    public void setElement1(Element other){
        element1 = new Element(other);
    }
    public void setElement2(Element other){
        element2 = new Element(other);
    }    
    public String getInfo(){
        return "Reaction["+reactionName+", "
                +element1.getInfo() +" + " + element2.getInfo() +"]";
    }
}
