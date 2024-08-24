package data;
//Right Triangle và Triangle có thể là 2 class riêng biệt
//phân biệt ai cha ai con
//Trong java có mối quan hệ kế thừa cha con có từ khóa là "is a"
//Triangle is a RightTriangle
//sai 
//RightTriangle is a Triangle
//     con              cha   
    
//tại sao phải kế thừa? => đỡ phải code nhiều 
//những gì mà tiền bối đã làm tốt rồi thì nên kế thừa(xài lại)
//những gì mà họ làm chưa tốt với mình thì mình phát triển và mở rộng
//thằng con bự hơn thằng cha
    
//"Kế thừa cái tốt, phát triển cái chưa tốt"
//  extends(mở rộng):
//      1. class cha sở hữu những cái chung
//      2. class con sẽ chứa những cái riêng của nó 
public class RightTriangle extends Triangle{
    //constructor
    public RightTriangle(double newEdgeA, double edgeB) {
        super(newEdgeA, edgeB, Math.sqrt(newEdgeA*newEdgeA + edgeB*edgeB));
    }//super: new Cha : new Triangle
    
    //method draw - showInfor
    @Override
    public void draw(){
        String str = String.format("RightTriangle  |%5.2f|%5.2f|%5.2f|%5.2f|%5.2f", 
                                    edgeA,edgeB,edgeC,getPerimeter(),getArea());
        System.out.println(str);
    }
}
