package entity;

import java.util.Scanner;

public class Person {
    //props
    protected String name;
    protected String gender;
    protected int yob;
    
    //constructor
    public Person(String name, String gender, int yob) {
        this.name = name;
        this.gender = gender;
        this.yob = yob;
    }
    
    public Person() { //overload
    }
    
    //getter
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getYob() {
        return yob;
    }
    
    //method showInfor
    public void showInfor(){
        System.out.printf("|%s|%s|%s|", name, gender, yob);
        //cố tình không xuống hàng
    }
    
    //method inputInfor
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        
        System.out.println("Nhập giới tính ");
        this.gender = sc.nextLine();
        
        System.out.println("Nhập năm sinh ");
        this.yob = Integer.parseInt(sc.nextLine());
    }
    
    
}
