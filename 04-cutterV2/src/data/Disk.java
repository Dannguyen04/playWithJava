package data;

public class Disk {
    //props
    private double radius;
    private static final double PI = 3.14;
    //static: không thuộc sở hữu của thằng nào cả, thuộc về class, các obj xài chung
    //final: không chỉnh sửa được nữa => hằng số
    
    //constructor
    public Disk(double radius) {
        this.radius = radius;
    }
    
    //getter
    public double getRadius() {
        return radius;
    }
    
    public double getPerimeter(){
        return (2*PI*radius);
    }
    
    public double getArea(){
        return PI*Math.pow(radius, 2);
    }
    
    public void draw(){
        String str = new String().format("Disk |%5.2f|%5.2f|%5.2f",
                              radius, getPerimeter(),getArea());
        System.out.println(str);
    }
    
}
