package runtime;
//muốn lưu trữ hình chữ nhật và hình vuông
//Rectangle(height, width, color)

import data.Disk;
import data.Rectangle;
import data.Square;

//Square(edge, color)

//Rectangle is a Square sai
//Square is a Rectangle đúng
//  con          cha

public class Program {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(3, 4, "Hường nam tính");
        Square sq1 = new Square(3, "Tím mộng mơ");
        Rectangle rec2 = new Square(6, "Xanh hi vọng");
        //Square sq2 = new Rectangle(0, 0, color);   sai
        
        Rectangle ds[] = new Rectangle[3];
        ds[0] = rec1;
        ds[1] = rec2;
        ds[2] = sq1;
        
//        for(int i = 0; i < ds.length; i++){
//            ds[i].draw();
//        }
        
        //for each
        for (Rectangle item : ds) {
            item.draw();
        }//cung cấp 1 vòng for each, duyệt cho tới khi hết thì thôi
        
        Disk d1 = new Disk(3);
        d1.draw();
    }//tạo hình tròn Disk(radius)
    
}
