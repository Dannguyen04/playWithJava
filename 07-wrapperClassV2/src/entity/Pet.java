package entity;

public abstract class Pet {
    //props
    protected String id;
    protected String owner;
    protected String color;
    protected double weight;
    
    //constructor
    public Pet(String id, String owner, String color, double weight) {
        this.id = id;
        this.owner = owner;
        this.color = color;
        this.weight = weight;
    }
    
    //phễu rỗng
    public Pet() {
    }

    //getter 
    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
    
    //method showInfor
    public abstract String showInfor();
    public abstract void inputInfor(); 
}
