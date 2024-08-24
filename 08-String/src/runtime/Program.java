package runtime;

import java.util.StringTokenizer;

public class Program {

    public static void main(String[] args) {
        String lname = new String("Dan");
        String tmp = lname;//con trỏ tmp(tham chiếu) trỏ lname
        String fname = "Nguyễn";//pool

        //String là immutable,bất kì thao tác nào lên object
        //đều không thay đổi giá trị của object đó 
        //mà sẽ tạo ra 1 object mới có kết quả đã bị thay đổi
        //immutable: bất biến 
        //lname.concat(fname); không thay đổi gì cả 
        //vì hành động này sẽ không làm lname thay đổi 
        lname = lname.concat(fname);
        System.out.println("lname = " + lname);
        System.out.println("tmp = " + tmp);
        //Array: mutable
        
        /*StringBuilder và String Buffer*/
        //2 thằng này là String nhưng mutable 
        //StringBuilder không tạo được bằng pool
        StringBuilder lname1 = new StringBuilder("Dan");
        StringBuilder tmp1 = lname1;//con trỏ (tham chiếu) trỏ lname 
        StringBuilder fname1 = new StringBuilder("Nguyễn");
        
        lname1.append(fname1);
        
        //StringBuilder là mutable 
        //nên hành động này làm lname1 bị thay đổi 
        //không cần hứng gì cả 
        System.out.println(lname1);
        System.out.println(tmp1);
        
        /*StringTokenizer - hash - split: băm*/ 
        String information = "SE182656| Dan | 2008 | 9.9";
        StringTokenizer st = new StringTokenizer(information, "|");
        //StringTokenizer như 1 tay tiều phu đi chặt tre của mình 
        //mình kêu chặt tại delim(đốt tre) là chặt
        System.out.println(st.countTokens());//4
        System.out.println(st.hasMoreTokens());//true
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            //.nextToken() vừa chặt vừa return khúc tre đã chặt 
            //và mình lấy khúc đã chặt mình in ra màn hình
        }
        
        System.out.println(st.countTokens());//0
        System.out.println(st.hasMoreTokens());//false
        System.out.println(information);//chả bị qq gì hết vì immutable
        checkStringMethod();
        playWithStringComparision();
    }
    
    public static void checkStringMethod(){
        //khi dùng method với String phải để ý return 
        //vì String là immutable nên thường method sẽ
        //ra String kết quả
        //ta cần phải hứng
        String str1 = "Dan"; //Pool
        String str2 = " Nguyen"; //Pool
        str1 = str1.concat(str2).concat(" Đẹp").concat(" Trai");
        
        System.out.println(str1);
        
        //length: độ dài 
        str1 = "Dan đẹp Trai";
        str2 = "đẹp";
        
        //hàm tìm vị trí
        System.out.println(str1.indexOf(str2)); //4
        //tìm có tồn tại 
        System.out.println(str1.contains(str2)); //true
        //ký tự ở vị trí 
        System.out.println(str1.charAt(8)); //T
        
    }
    
    public static void playWithStringComparision(){-
        String s0 = new String("LUE THICH CHOI GAY");
        String s1 = "LUE THICH CHOI GAY"; //Pool
        String s2 = "LUE THICH CHOI GAY"; //Pool
        String s3 = "lue thich chơi gay"; //Pool
        String s4 = new String("LUE THICH CHOI GAY");
        String s5 = new String("LUE THICH CHOI GAY");
        
        System.out.println(s0 == s1); //false 
        //so sánh địa chỉ, lấy cái qq mà bằng nhau 
        
        System.out.println(s1 == s2); //true 
        //so sánh địa chỉ, nhưng s1 và s2 là pool cùng giá trị
        //cùng vùng nhớ
        
        System.out.println(s2 == s3); //false
        //cùng pool khác giá trị 
        
        System.out.println(s4 == s5); // false
        //2 thằng khác địa chỉ 
        
        //String là object, so sánh String luôn là so sánh địa chỉ
        //muốn so sánh giá trị của String ?
        //.equals() (true,false)   .compareTo() (-1,0,1)
    }
    
    
}
