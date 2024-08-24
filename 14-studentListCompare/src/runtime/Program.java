package runtime;
//so sánh 2 object dùng kỹ thuật gì?
// comparator (anh trọng tài - máy phân loại hàng)

import entity.StudentV1;
import entity.StudentV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

// comparable (tính gato)

public class Program {
    public static void main(String[] args) {
        //sortV1();
        sortV2();
    } 
    
    public static void sortV1(){
        //sortV1 mình sẽ sort danh sách sinh viên bằng anh trọng tài 
        //dùng comparator (anh trọng tài)
        
        //tạo danh sách sinh viên
        ArrayList<StudentV1> stuList = new ArrayList<>();
        stuList.add(new StudentV1("SE0001", "Đoàn", "Duy", 5));
        stuList.add(new StudentV1("SE0004", "Trần", "Minh", 4.5));
        stuList.add(new StudentV1("SE0005", "Trương", "Tài", 7));
        stuList.add(new StudentV1("SE0002", "Concat", "Vinh", 2));
        stuList.add(new StudentV1("SE0003", "Hiền triết", "Galaxy", 9));
        
        /*
            - giờ muốn sort mình có thể dùng Comparator
            - Comparator: là 1 anh trọng tài đứng ra xem xét 2 object 
                            bất kỳ trong mảng dựa trên 1 tiêu chí nào đó 
            - Comparator: là 1 interface có abs method là compare
                + nếu tạo 1 anh trọng tài thì cần bổ sung code cho compare 
                + nói cách khác là anh trọng tài hơi "non"
                + mình phải "dạy" cho anh đó biết cách so sánh
        */
        
        //Cách 1: tạo ra comparator trước rồi dùng anh đó để so sánh id
        Comparator ordByID = new Comparator<StudentV1>() {
            @Override
            public int compare(StudentV1 t1, StudentV1 t2) {
                if(t1.getId().compareTo(t2.getId()) > 0){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        
        Collections.sort(stuList, ordByID);
        //Collections.reverse(stuList);
        //in ra cho user ngu xem
        for (StudentV1 item : stuList) {
            item.showInfor();
        }
        
        //Cách 2: shortHand
        Collections.sort(stuList, new Comparator<StudentV1>() {
            @Override
            public int compare(StudentV1 t1, StudentV1 t2) {
                return t1.getId().compareTo(t2.getId());
            }
        });
           
        //in ra cho user ngu xem
        for (StudentV1 item : stuList) {
            item.showInfor();
        } 
    }
    
    public static void sortV2(){
        ArrayList<StudentV2> stuList = new ArrayList<>();
        stuList.add(new StudentV2("SE0001", "Đoàn", "Duy", 5));
        stuList.add(new StudentV2("SE0004", "Trần", "Minh", 4.5));
        stuList.add(new StudentV2("SE0005", "Trương", "Tài", 7));
        stuList.add(new StudentV2("SE0002", "Concat", "Vinh", 2));
        stuList.add(new StudentV2("SE0003", "Hiền triết", "Galaxy", 9));
        
        Collections.sort(stuList);
        
        for (StudentV2 item : stuList ) {
            item.showInfor();
        }
    }
}









