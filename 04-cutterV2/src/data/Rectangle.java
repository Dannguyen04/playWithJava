package data;

public class Rectangle {
    //props
    protected double width;
    protected double height;
    protected String color;
    
    //constructor
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    //getter
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
    
    //method getPerimeter
    public double getPerimeter(){
        return (width + height) * 2;
    }
    
    //method getArea
    public double getArea(){
        return width * height;
    }
    
    //method draw
    public void draw(){
        String str = new String().format("Rectangle   |%5.2f|%5.2f|%-10s|%5.2f|%5.2f",
                              width, height, color, getPerimeter(),getArea());
        System.out.println(str);
    }
}
