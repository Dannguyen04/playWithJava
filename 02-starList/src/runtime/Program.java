package runtime;

import data.Star;

public class Program {
    public static void main(String[] args) {
        //phải import bằng ctrl + Space 
        Star mtp = new Star("Nguyễn Thanh Tùng", 1994, 
                            "Nam", "Em của ngày hôm qua");
        //new Star: gọi phễu - constructor
        //sử dụng dấu chấm thần thánh để gọi ra các method
        mtp.showInfor();
        
        Star chipug = new Star("Nguyễn Thùy Chi", 1993, "Nữ", "Chiếc Ố");
        chipug.showInfor();
        
        mtp.setName("Lệ Rơi", 1);
        System.out.println("Tôi tên: " + mtp.getName());
        
        //thêm static cho gender
        Star ngoc = new Star("Trần Thị Ngọc Trinh", 1989, "Nữ", "Vòng eo 56");
        ngoc.showInfor();
        
        Star dat = new Star("Nguyễn Tiến Đạt", 2004, "Nam", "Chào những bông hoa nhỏ ham học");
        dat.showInfor();
        
        System.out.println("Em là " + ngoc.gender);
    }
}
/*  Lý thuyết
    Modifier(định nghĩa): điểm G "thần thánh"
        1. access modifier
            - public: phạm vi truy cập rộng nhất, ai cũng có thể cham được điểm G
            - private: mỗi mình nó thôi, không ai chạm được
            - default: phạm vi truy cập ở trong package. Nếu mà mình tạo mà không thêm
                                        access modifier thì nó là default
            - protected: giống public nhưng mà chỉ cho class con xài thôi không cho 
                                            class khác xài
        *Nguyên tác bất hiếu (Inheritance): cha cho con những gì cha có
                                            con thì say "đéo"
        2. non-access modifier
            - final(class, method, props):
                + final class: class này không có khả năng nhận con 
                + final method: cho kế thừa method cấm overwrite(ghi đè) 
                + final props: hằng số (biến không thể thay đổi giá trị được)
            - abstract(trừu tượng):
                + abstract method: hành động không được định nghĩa
                + 1 class mà có abstract method thì class đó là abs class
                + 1 abs class không nhất thiết phải có abs 
            - static: tĩnh (đứng yên một chỗ)
                + nó là của chung cho tất cả các object
*/

