package data;

public class Disk extends Shape{
    //props
    private double radius;
    private static final double PI = 3.14;
    
    //constructor
    public Disk(String owner, String color, double radius) {
        super(owner, color);
        this.radius = radius;
    }
       
    //getter
    public double getRadius() {
        return radius;
    }
    
    @Override
    public double getPerimeter(){
        return (2*PI*radius);
    }
    
    @Override
    public double getArea(){
        return PI*Math.pow(radius, 2);
    }
    
    @Override
    public void draw(){
        String str = new String().format("Disk   |%-10s|%-10s|%5.2f|%5.2f|%5.2f",
                              owner, color, radius, getPerimeter(),getArea());
        System.out.println(str);
    }  
}
