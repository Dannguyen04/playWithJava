package runtime;
//có nhu cầu lưu trữ các hình tam giác 
//chế ra cái kiểu dữ liệu mới là tam giác (chế ra cái khuôn để đúc - class)

import data.RightTriangle;
import data.Triangle;


public class Program {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(2, 5, 6);
        tr1.draw();
        RightTriangle rtr1 = new RightTriangle(3, 4);
        rtr1.draw();
    }   
}

//class con to hơn hay nhỏ hơn class cha?
//to hơn vì con kế thừa cha, cha cho con hết những gì cha có
//con còn có thêm những cái riêng của con => to hơn

//trong constructor của con có new Cha
//=> muốn tạo con thì phải tạo thêm thằng cha bên trong trước

//Override là gì
//Override chỉ xuất hiện trong mối quan hệ cha con
//Khi con độ hàm của cha - Po độ lại bí kíp thần long 
//Tạo ra một method khác cùng với method của cha 
//Po độ lại bí kíp thần long thì trước đó nó vẫn tên là 
//bí kíp thần long