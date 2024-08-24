package runtime;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;

public class Program {
    public static void main(String[] args) {
        //tạo 1 mảng chứa được rec, square, disk
        Shape ds[] = new Shape[3];
        ds[0] = new Disk("Lue", "Tím mộng mơ", 2.0);
        ds[1] = new Rectangle("Vinh", "Hường nam tính", 2, 3);
        ds[2] = new Square("Tài", "Xanh hi vọng", 4);
        
        for (Shape item : ds) {
            item.draw();
        }
        
        /*
            - Muốn tạo obj cần gì?
                + cái khuôn 
                + cái phễu - constructor 
                + biến con trỏ hay biến tham chiếu
            - Vậy thì obj của 1 class con được tạo như thế nào?
                + y chang, chẳng khác gì, cũng khuôn, phễu, biến con trỏ
                + Square sq = new Square(?,?,?)
            - Tuy nhiên nếu ta phân kĩ sâu vào obj con 
                + new Con sẽ có new Cha bên trong (hành động super)
                + mục đích:
                    + giúp con có tất cả những gì cha có (giảm bớt code, đỡ nặng)
                    + bản thân class con và class cha đều có thể độc lập
                    + nhưng để nhận cha con thì thằng con sẽ đưa cho cha những điểm chung
                    + vì vậy lúc kế thừa chính là lúc nó lấy lại những thứ đó 
                    + kế thừa những điều mà tiền thân đã làm tốt
            - Obj con nếu phân tích sẽ là:
                + Square sq1 = new Square();
                             = new Rectangle + code của riêng nó
                + obj Con = new Cha          + code của riêng của con 
                             super               extends - inherit
                            di truyền               vùng biến dị
            - Nếu cha là abs class thì sao?
                + obj con = new Cha + code riêng của con + code của abs method của cha
            - Vì abs class không thể đúc ra obj
                + nó cần một class trung gian kế thừa và vá lỗ thủng
            - Nhưng mà mình lười tạo ra class trung gian 
            - Mình muốn sử dụng abs class để đúc ra obj thì sao?
            - sẽ đúc được => kỹ thuật anonymous (mượn gió bẻ măng)
            - khi nào mình cần dùng anonymous?
                + dùng khi muốn đúc ra obj mà không cần qua class trung gian
                + từ cái khuôn bị thủng (abs class)
            - ưu điểm và nhược điểm của anonymous
                + ưu điểm: lẹ, tạo nhanh, đỡ đặt tên, không qua trung gian
                            tạo obj từ abs class một cách trực tiếp
                + nhược điểm: mỗi lần dùng là mỗi lần phải implement (vá lỗ thủng)
                              cao tay lắm thì copy lại thôi (lặp code)

        */
        //Anonymous
        //Shape là abs class - cái khuôn bị thủng
        Shape xxx = new Shape("Lue khung", "Da") {
            @Override
            public double getPerimeter() {
                return 18;
            }

            @Override
            public double getArea() {
                return 200;
            }

            @Override
            public void draw() {
                String str = String.format("Lue khung  |%-10s |%-10s|%5.2f|%5.2f",
                                            owner, color, getPerimeter(), getArea());
                System.out.println(str);
            }
        };
        xxx.draw();
        
        //Drift: con trỏ của object
        //r1 là 1 con trỏ nằm trong vùng Stack điểu khiển object nằm trong vùng Heap
        //chuyên đi trỏ vào vùng của Rectangle
        Rectangle r1 = new Rectangle("r1", "Red", 2, 5); //khai cha new cha
        Square s1 = new Square("s1", "Yellow", 4);       //khai con new con   
        Rectangle r2 = new Square("r2", "Green", 8);     //khai cha new con
        r1.draw();
        s1.draw();
        r2.draw();
        //r2. sẽ không có method drawTitle 
        //thực ta trong vùng nhớ của con đã có vùng nhớ của cha
        //nhưng r2 là 1 con trỏ dành cho Rectangle 
        //nên nó chỉ "sờ" vào được khu vực của Rectangle - cha
        //mà drawTitle là 1 method riêng của Square - Con
        //khai cha new con
        //nó sẽ xài được override method, nhưng không xài được hàm riêng của con
        //Drift => ép kiểu 
        Square tmp = (Square)r2; 
        tmp.drawTitle();
        
        ((Square)r2).drawTitle();
    }

   
}
