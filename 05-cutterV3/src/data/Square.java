package data;

public class Square extends Rectangle{
    //constructor
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge); //edge là giá trị người dùng sẽ nhập vào
    } 
    
    //method draw
    @Override
    public void draw(){
        String str = new String().format("Square   |%-10s|%-10s|%5.2f|%5.2f|%5.2f|%5.2f",
                              owner, color, width, height, getPerimeter(),getArea());
        System.out.println(str);
    }
    
    //thêm 1 cái hàm nữa
    public void drawTitle(){
        System.out.println("Lue trap boy");
    }
}
