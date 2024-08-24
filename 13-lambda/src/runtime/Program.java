package runtime;
//trong 1 file java có thể có nhiều class
//nhưng chỉ có class trùng tên file public mà thôi
public class Program {
    public static void main(String[] args) {
        Human h1 = () -> {
            System.out.println("Con cho Hoang");
        };
        
        h1.show();
        
        //demo
        Math m1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println(m1.add(10, 5));
        
        //shortHand
        Math m2 = (a,b) -> (a+b);
        System.out.println(m2.add(10, 10));
    }
}

interface Human{
    public void show();
}
interface Math{
    public int add(int a, int b);
}
/*
    - lambda là cái cc gì?
        + xuất hiện ở Java 8
        + chỉ học để tham khảo 
        + đi thi mà xài => auto cút 
    - nhiệm vụ lớn nhất của lambda là kỹ thuật thay thế cho anonymous
        + trong việc tạo object cho interface
    - ưu điểm : nhanh

    (argument-list)-> {body}
    *Lưu con mẹ nó ý: nếu body chỉ có 1 dòng thì không cần return
*/