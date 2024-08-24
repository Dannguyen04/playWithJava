package data;

public class Square extends Rectangle{
    //constructor
    public Square(double edge, String color) {
        super(edge, edge, color);
    }//super: new Cha : new Rectangle 
    
    //method draw
    @Override
    public void draw(){
        String str = new String().format("Square   |%5.2f|%5.2f|%-10s|%5.2f|%5.2f",
                              width, height, color, getPerimeter(),getArea());
        System.out.println(str);
    }
}
