package data;
//0. tạo class con
//1. khai báo đặc tính riêng của con
//2. cho con nhận cha: extend 
//3. tạo phễu - constructor
//4. làm những phần việc mà cha giao cho mình (nếu có):
//      bổ sung code cho abs method của cha (nếu có)
//      nếu mà mình không bổ sung thì sẽ trở thành abs class
//      nếu không có abs method thì độ lại(cái nào không tốt thì độ)
public class Rectangle extends Shape{
    //props
    protected double width;
    protected double height;
    
    //constructor  
    public Rectangle(String owner, String color, double width, double height) {
        //cái nào của cha thì để ở trước
        super(owner, color);
        this.width = width;
        this.height = height;
    }
    
    //getter
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    
    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        String str = new String().format("Rectangle |%-10s|%-10s|%5.2f|%5.2f|%5.2f|%5.2f"
                        , owner, color, width, height, getPerimeter(), getArea());
        System.out.println(str);
    }
}
