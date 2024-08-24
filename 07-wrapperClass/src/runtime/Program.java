package runtime;

public class Program {
    public static void main(String[] args) {
        //primitive: nguyên thủy, không thể tách nhỏ hơn được nữa
        int a = 10;
        //4 byte  4*8bit
        //biểu diễn trong thanh RAM để hiển thị số 
        //a. là không được
        
        //Wrapper class
        Integer b = new Integer(10);
        //new Integer(10) là tạo 1 object và nhét số vào trong 
        //core(lõi) của object đó 
        //b là con trỏ để trỏ object đó 
        
        //a khác gì b?
        
        //a là biến primitive, rất nhỏ 
        //          nó không thể tách nhỏ hơn được nữa
        //          => nhỏ ít dung lượng 
        
        //b là 1 object có core là 10
        //          ngoài việc lưu số 10, nó còn lưu method, bla bla bla
        //          => chiếm nhiều dung lượng, rất nhiều method 
        //              hỗ trợ cho số 10(ép kiểu, ....)
        
        //Integer b = new Integer(10);
        //gói con số 10 vào 1 object 
        //=> boxing: đóng gói
        //boxing diễn ra khi nào Wrapper class = primitive 
        
        System.out.println("a = " + a);//10
        System.out.println("b = " + b);//10
        //nếu đúng ra khi in b thì chỉ in được địa chỉ 
        //nhưng mà trong java có cơ chế auto-unboxing 
        //nên là nó tự động "bóc tem" mở object b lấy cái core(10) in ra màn hình
        System.out.println("b = " + b.toString());
        
        int c = b;//auto-unboxing
        //"bóc tem" b ra lấy core ra đưa cho c hứng
        System.out.println("c = " + c);
        
        //ngoài ra ta có thể viết tắt như sau 
        Integer d = 2000; //Pool
        System.out.println("d = " + d);//auto-unboxing
        
        System.out.println("sum = " + (a+d));//2010
        
        //wrapper class được hỗ trợ cơ chế auto-unboxing
        //nên mình có thể tính toán, trao đổi trực tiếp
        //với primitive một cách bình thường, không cần lưu ý gì cả 
        
        a = 2000;//primitive
        b = 2000;//wrapper
        c = 2000;//wrapper
        
        System.out.println(a == b);//true
        //wrapper class so với primitive 
        //thì wrapper class auto-unboxing lấy core ra so sánh 
        //so sánh giá trị bằng nhau 
        
        System.out.println(b == d);//false
        //wrapper so với wrapper là 2 object so với nhau 
        //nó sẽ so về địa chỉ => false
        
        //vậy muốn 2 wrapper(object) so sánh về giá trị thì sao?
        //.equal() (true|fasle)     .compare() (1, 0, -1)
        System.out.println(b.equals(d)); //true
        System.out.println(b.compareTo(d)); //0                           
    } 
}
