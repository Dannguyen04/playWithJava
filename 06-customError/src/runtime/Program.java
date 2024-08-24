package runtime;
//customError

import java.nio.file.FileSystemException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //I.Regex là gì?====================
            //Regex | Regular Expression | Parttern | Biểu thức chính quy
            //Mẫu cho String noi theo, String so sánh
            String str = "SE182656";
            String str1 = "YE123456";
            String regex1 = "^((SE)|(SS)|(YE))\\d{6}";
            // "\" thông báo cho máy biết là sẽ có ký tự đặc biệt đằng sau
            //test
            System.out.println(str.matches(regex1));
            System.out.println(str1.matches(regex1));
            
            //1. ký tự cố định
            //chuỗi mà thằng người dùng đưa có phải là Luebede không?
            System.out.println(checkRegex("Luebede", "Luebede"));//true
            System.out.println(checkRegex("LUEBEDE", "Luebede"));//false
            
            //2. bỏ qua hoa thường: (?i) : ignoreCase
            System.out.println(checkRegex("LUEBEDE", "(?i)Luebede"));//true
        //II. metcharacter symbol====================
            //1. ký tự bất kỳ: "."
            System.out.println(checkRegex("Luebede", "Luebeda"));//false
            System.out.println(checkRegex("Luebeda", "Luebed."));//true
            //dấu . đại điện cho 1 ký tự bất kỳ trừ dấu xuống hàng
            
            //2. lặp lại ký tự trước từ 0 -> nhiều lần: "*"
            System.out.println(checkRegex("Luebedeeeee", "Luebede*"));//true
            
            //3. được quyền xuất hiện hoặc không: "?"
            System.out.println(checkRegex("Luebede", "Luebedea?"));//true
        
        //III. character set====================
            //1. 1 phần tử bất kỳ trong tập hợp: [...]
            System.out.println(checkRegex("Lae", "L[aou]e"));//true
            
            //2. 1 phần tử bất kỳ khác trong tập hợp: [^...]
            System.out.println(checkRegex("Lae", "L[^aou]e"));//false
                //"^": phủ định, ngược lại
            
            //3. khớp các chữ cái 
            System.out.println(checkRegex("LAe", "L[a-z]e"));//false
                //[a-z]: 1 ký tự bất kỳ từ a đến z
                //[A-Z]: 1 ký tự bất kỳ từ A đến Z
                //[A-Za-z]: 1 ký tự bất kỳ hoa thường tao đều chơi
            
            //4. khớp 
                //[0-9]: 1 ký tự là số
            
            //5. Giới hạn số lượng ký tự {}
                //{4}: ký tự đó sẽ được lặp 4 lần
                //{1,4}: ký tự đó sẽ được lặp từ 1 đến 4 lần 
                //{2,}: ký tự đó sẽ được lặp từ 2 đến nhiều lần
                //{0,}: *
                //{1,}: +
                //{0,1}: ? 
            //6. Group: gom nhóm: ()
            //7. hoặc: | thường đi chung với ()
            System.out.println(checkRegex("Luue", "L(u{2}|u{4})e"));//true
        //IV. shortHand: viết tắt====================
            //1. khớp với các chữ cái và số: \w -> [a-zA-Z0-9]   \W: phủ định
            //2. khớp với số                 \d -> [0-9]         \D: phủ định
            //3. khớp với space              \s -> " "           \S: phủ định 
        
        //Try catch - "catch the bitch"
            //error compilation: lỗi trong quá trình biên dịch
            //do mình - dev dởm 
            
            //error runtime: lỗi này phát sinh trong khi chạy code
            //do mình 
            
            //scanf
            //Trong java có class chuyên dùng để nhập
            //Scanner: chuyên cung cấp các method để nhập
            
            Scanner sc = new Scanner(System.in);
            int age = 0;
            boolean check = true;
            try {
                System.out.println("Nhập bố mày cái tuổi: ");
                age = sc.nextInt();
                if(age < 18){
                    check = false;
                    throw new Exception();
                }
            } catch (Exception error) {
                System.out.println("Đi tù đi cu, mày lỡ dại rồi đó");
            } finally{
                System.out.println("Đã thông báo kết quả");
            }
            //finally sẽ chạy dù cho chương trình bị kết thúc
            System.out.println("Tuổi lol " + age);
            System.out.println("Check " + check);
    }  
    
    //viết thêm hàm checkRegex
    public static boolean checkRegex(String str, String regex){
        return str.matches(regex);
    }
    
}
