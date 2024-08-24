package runtime;

import entity.Student;
import util.Inputter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //tạo 1 person và check hàm 
        //tạo 1 student và check hàm 

        //test nhập số nguyên
        String str = Inputter.getADate("Nhập ngày tháng năm đi: ", 
                                       "Nhập sai cmnr", 
                                       "dd-MM-uuuu");
        System.out.println(str);




        
        //ArrayList: 1 thằng mảng có khả năng co giãn 
        ArrayList<Student> studentList = new ArrayList<>();
        //studentList là mảng chứa các object student đã được tạo bằng ArrayList
        
        int choose; //lưu lựa chọn của người dùng
        
        do{
            //showMenu
            showMenu();
            //getChoose
            System.out.println("Nhập lựa chọn mày muốn concat cu đi: ");
            Scanner sc = new Scanner(System.in);
            choose = Integer.parseInt(sc.nextLine());
            //thực thi lựa chọn 
            switch(choose){
                case 1:{
                    Student newStudent = new Student();
                    newStudent.inputInfor();
                    //thêm object mới tạo vào mảng 
                    studentList.add(newStudent);
                    break;
                }
                case 2:{
                    for (Student item : studentList) {
                        item.showInfor();
                    }
                    break;
                }case 3:{
                    //đi tìm điểm cao nhất và thấp nhất 
                    //giả định 
                    double max = studentList.get(0).getGpa();
                    double min = studentList.get(0).getGpa();
                    //đi tìm max min
                    for (Student item : studentList) {
                        if(item.getGpa() > max){
                            max = item.getGpa();
                        }
                        if(item.getGpa() < min){
                            min = item.getGpa();
                        }
                    }
                    //in ra cao điểm nhất và thấp điểm nhất 
                    System.out.println("Những thằng cao điểm nhứt");
                    for (Student item : studentList) {
                        if(item.getGpa() == max){
                            item.showInfor();
                        }
                    }
                    
                    System.out.println("Những thằng thấp điểm nhứt");
                    for (Student item : studentList) {
                        if(item.getGpa() == min){
                            item.showInfor();
                        }
                    }
                    break;
                }case 4:{
                    System.out.println("Nhập mã sinh viên cần tìm: ");
                    String key = sc.nextLine(); 
                    boolean isFind = false;
                    for (Student item : studentList) {
                        if(item.getId().equals(key)){
                            item.showInfor();
                            isFind = true;
                        }
                    }
                    if(!isFind){
                        System.out.println("Không có sinh viên đó!!!");
                    }
                    break;
                }case 5:{
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student t1, Student t2) {
                            if(t1.getName().compareTo(t2.getName()) > 0 ){
                                return 1;
                            }
                            return -1;
                        }
                    });
                    //in kết quả 
                    for (Student item : studentList) {
                        item.showInfor();
                    }
                    break;
                }case 6:{
                    //sort studentList theo điểm
                    Collections. sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student t1, Student t2) {
                            if(t1.getGpa() > t2.getGpa()){
                                return 1;
                            }
                            return -1;
                        }
                    });
                    
                    Collections.reverse(studentList);
                    
                    //in kết quả 
                    for (Student item : studentList) {
                        if(item.hasScholarship()){
                            item.showInfor();
                        }
                    }
                    break;
                }case 7:{
                    System.out.println("Ok bye bye, cook");
                    break;
                }
                default:{
                    System.out.println("Lựa chọn không tồn tại, concat cu");
                    break;
                }
            }
        }while(choose != 7);
    }
    
    public static void showMenu(){
        System.out.println("1. Nhập vào 1 sinh viên ");
        System.out.println("2. Hiển thị thông tin sinh viên ");
        System.out.println("3. Hiển thị sinh viên cao điểm nhất và thấp điểm nhất ");
        System.out.println("4. Tìm kiếm theo mã sinh viên ");
        System.out.println("5. Sắp xếp sinh viên theo alphabet abc");
        System.out.println("6. Hiển thị sinh viên theo học bổng ");
        System.out.println("7. Cúc - Quit");
    }
}

/*
1. Nhập vào 1 sinh viên "done"
2. Hiển thị thông tin sinh viên "done"
3. Hiển thị sinh viên cao điểm nhất và thấp điểm nhất 
4. Tìm kiếm theo mã sinh viên 
5. Sắp xếp sinh viên theo alphabet abc
6. Hiển thị sinh viên theo học bổng 
7. Cúc - Quit
*/