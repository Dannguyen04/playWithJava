package entity;

public class Dog extends Pet{
    //props
    private String necklace;
    
    //constructor
    public Dog(String id, String owner, String color, double weight, String necklace) {
        super(id, owner, color, weight);
        this.necklace = necklace;
    }
       
    //getter
    public String getNecklace() {
        return necklace;
    }

    //setter
    public void setNecklace(String necklace) {
        this.necklace = necklace;
    }

    //method showInfor
    @Override
    public void showInfor() {
        String str = String.format("%4s|%-15s|%-15s|&6.2f|&s", 
                                id, owner, color, weight, necklace);
        System.out.println(str);
    }
    
    //method toString
    @Override
    public String toString() {
        String str = String.format("%4s|%-15s|%-15s|&6.2f|&s", 
                                id, owner, color, weight, necklace);
        return str;
    }
}
