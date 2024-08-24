package data;
//Shape là class cha của mọi hình
//cha của tam giác, cha của hình tròn, cha của hình chữ nhật
//nếu shape là cha thì nó làm gì?
//Class cha chỉ được chứa những điểm chung của các con mà thôi

public abstract class Shape {
    //double edge double radius - không phải điểm chung của các con
    //props
    protected String owner;
    protected String color;
    
    //constructor - phễu
    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
    }
    
    //getter 
    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }
    
    //method
    public abstract double getPerimeter(); 
    public abstract double getArea();
    public abstract void draw();
    
    //Tại sao không viết công thức cho diện tích và chu vi?
    //1. Không có công thức chung cho tất cả các hình
    //2. Vậy thì nếu bỏ một công thức bất kỳ, các thằng con sẽ kế thừa nó
    //          không đúng với tất cả => sai logic
    //3. Cho nên mình sẽ bỏ trống => bỏ trống thì sẽ trở thành abs method
    //=> abs class
}
/*
    - abs class như cái khuôn bị thủng, abs class không có khả năng đúc ra obj
    - nhưng vẫn kế thừa được
    - vì obj được tạo ra sẽ không xài được mấy abs method(thủng) đó

    - Vậy muốn dùng abs class để đúc obs người ta dùng gì?
    - class trung gian:
        + cho class khác kế thừa shape và 
        + bổ sung code cho các abs method của shape
        + nếu mình vá được hết lỗ thủng thì có thể dùng class trung gian để đúc obj
    - Điều gì sẽ xảy ra nếu class trung gian không bổ sung code:
        + thì class trung gian đó sẽ trở thành abs class
        + và chờ 1 thằng class khác kế thừa và bổ sung code
    - abs không tạo được obj
        + nếu anh cố chấp anh muốn đúc ra obj?
        => kỹ thuật anonymous
*/
