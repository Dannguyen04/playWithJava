package runtime; //app

public class Program {
    public static void main(String[] args) {
        //runtime là package xương sống của nguyên cái project
        //package viết thường hết
        //class thì viết theo kiểu upper cammel case(viết hoa chữ cái đầu tiên)
        //                         Pascal case
        //comment nhanh: bôi đen ctrl + '/' 
               
        /*
        Trong java có 2 kiểu dữ liệu 
            1.Primitive datatype(kiểu dữ liệu nguyên thủy):
                Dùng 1 lượng nhỏ bộ nhớ để biểu diễn giá trị không thể chia nhỏ nữa
                Đặt tên: camelCase(con lạc đà)
                1.byte == 1 byte (số nguyên rất rất nhỏ: -128 -> 127)
                2.short == 2 byte (số nguyên rất nhỏ)
                3.int == 4 byte (số nguyên nhỏ)
                4.long == 8 byte (số nguyên lớn)
                5.float == 4 byte (số thực nhỏ)
                6.double == 8 byte (số thực lớn)
                7.char == 2 byte (ký tự (Unicode))
                8.boolean == 1 bit (true | false)
        */
        
        //in ra màn hình
        char ch = 65;
        System.out.println("Ch chứa " + ch); //ln: line new
        System.out.printf("Ch chứa %c\n", ch); //format
        System.out.println("5 + 5 = " + (5 + 5) );
        
        //byte == 1 byte (số nguyên rất rất nhỏ: -128 -> 127)
        //byte numByte = -129; (khả năng quá lơn để lưu)
        byte numByte = 127;
        
        //int 
        int numInt = 1234;
        
        //float
        float numFloat = 123.5F;  //java ưu tiên số thực là double, thêm chữ
                                 // F,f để ép kiểu về float
                                 
        //double                          
        double numDouble = 123.5;                         
                                 
        //numByte = numInt;                         
        //sử dụng biến 
        //gán biến nhỏ vào biến lớn, không được ngược lại
        
        /*
            java ưu tiên số nguyên là int
        */
        
        //***hacking Primitive
        long money = 10_000_000_000L; //dùng _ để phân biệt các số 0
        System.out.println(money);
        
        int num1 = 0xFA;
        //0x: tiền tố (prefix) ám chỉ số nguyên này biểu diễn dưới dạng hexa(16)
        
        int num2 = 076;
        //0 là tiến tố ám chỉ octal(8)
        System.out.println("num2 là " + num2);
        
        //***Operator: toán tử
        //trong java có ít nhất 10 loại toán tử
        
        //Arithmetic: tonas tử toán hạng
        //+ - * / % ++ --
        //+= -= *= /= %=
        
        int a = 10;
        int b = ++a + a++ - --a + a--;  
        System.out.println("b = " + b + ", a = " + a);
        
        //Assignment: phép gán 
        //Comparison: phép so sánh
        // > < >= <= == !=
        // &&: tìm false
        // ||: tìm true
        // & |
        
        //conditional: toán tử ba ngôi 
        int numA = 10;
        int numB = 20;
        int numC = numA > numB ? 20 : 10;
        System.out.println(numC);
        
        //Shift: dịch bit
        //đẩy xuống thì rớt | đẩy về thì bù 0
        
        int numR = 8;
        numR = numR >> 2;//2
        // 000010
        
        numR = numR << 2;//32
        // 00100000
        
        //n >> x => n/(2^x)
        //n << x => n*(2^x)
        
        //bitwise: toán tử bit(&, |, ^, ~)
        
        //&: có 0 thì tất cả là 0, ngược lại là 1
        //  0 1 1 0 1 0
        //&
        //  0 1 0 1 0 0
        //  0 1 0 0 0 0
        
        //|: có 1 thì tất cả là 1, ngược lại là 0
        //  0 1 1 0 1 0
        //|
        //  0 1 0 1 0 0
        //  0 1 1 1 1 0
        
        //^(XOR): 2 số khác nhau thì là 1, giống nhau thì ra 0
        //  0 1 1 0 1 0
        //^
        //  0 1 0 1 0 0
        //  0 0 1 1 1 0
        
        //~: not, đổi ngược
        //  0 1 1 0 1 0
        //~
        //  1 0 0 1 0 1
        
        //2.Reference dataType: Wrapper & object dataType
        //kiểu dữ liệu do người con me dùng định nghĩa
        //bằng các primitive dataType
        //student(name(String-char), yob(int), gba(float))
    }
}
