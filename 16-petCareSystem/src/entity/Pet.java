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
    
    //thường thì bài về quản lý mình sẽ nhờ người dùng nhập
    //nên cần phễu rỗng
    //phễu rỗng + hàm nhập thông tin + setter thông minh
    //tính flexible không cao hay không ngon => không dùng
    
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
    
    //setter
    public void setId(String id) {
        this.id = id;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //method showInfor
    public abstract void showInfor();
}
