package entity;
//Student is a Person

import java.util.Scanner;

public class Student extends Person{
    private String id;
    private double gpa;
    private String email;

    public Student(String name, String gender, int yob, 
                    String id, double gpa, String email) {
        super(name, gender, yob);
        this.id = id;
        this.gpa = gpa;
        this.email = email;
    }
    public Student() {
    }
    
    //getter 
    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String getEmail() {
        return email;
    }
    
    //tạo setter "xì mát": nghĩa là nhận giá trị 
    //nếu giá trị valid thì gán giá trị vào ngăn và return 
    //nếu giá trị invalid thì không gắn vào ngăn và return false
    public boolean setId(String id){
        if(id.length() != 0){
            this.id = id;
            return true;
        }else{
            System.out.println("Id không hợp lệ, nhập lại cho bố mày");
            return false;
        }
    }
    
    //setter "xì mát" cho gpa
    public boolean setGpa(double gpa){
        if(gpa >= 0 && gpa <= 10){
            this.gpa = gpa;
            return true;
        }else{
            System.out.println("Gpa không hợp lệ, nhập lại cho bố mày");
            return false;
        }
    }
    
    //setter "xì mát" cho email
    public boolean setEmail(String email){
        if(!email.isEmpty() && email.contains("@")){
            this.email = email;
            return true;
        }else{
            System.out.println("Email không hợp lệ, nhập lại cho bố mày");
            return false;
        }
    }
    
    //method inputInfor
    @Override
    public void inputInfor(){
        super.inputInfor(); //Person.inputInfor nhập được name, gender, yob
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        while(!setId(sc.nextLine()));
        
        System.out.println("Nhập gpa: ");
        //this.gpa = sc.nextDouble(); //nếu mà mình nhập như này sẽ bị trôi lệnh
        //Wrapper class + sc.nextline 
        //nhập vào 1 chuỗi, ép tất cả về double, loại bỏ các kí tự lạ 
        //this.gpa = Double.parseDouble(sc.nextLine());
        while(!setGpa(Double.parseDouble(sc.nextLine())));
        
        System.out.println("Nhập email: ");
        while (!setEmail(sc.nextLine()));
    }
    
    //method showInfor
    @Override
    public void showInfor(){
        super.showInfor();
        System.out.printf("%s|%f|%s|\n", id, gpa, email);
    }
    
    //method hasScholarship
    public boolean hasScholarship(){
        return this.getGpa() >= 8;
    }
}
