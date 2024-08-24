package entity;

import java.util.Scanner;

public class Dog extends Pet{
    //props riêng
    private String necklace;
    
    //constructor
    public Dog(String id, String owner, String color, 
                        double weight, String necklace) {
        super(id, owner, color, weight);
        this.necklace = necklace;
    }

    public Dog() {
    }
    
    //getter
    public String getNecklace() {
        return necklace;
    }

    @Override
    public String showInfor() {
        String str = String.format("Dog    |%-10s|%-10s|%-10s|%5.2f|%-10s", 
                                    id, owner, color, weight, necklace);
        return str;
    }

    @Override
    public String toString() {
        return "Dog{" + "necklace=" + necklace + '}';
    }

    
    

    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cho tao cái id đê: ");
        this.id = sc.nextLine();
        System.out.println("Nhập cho tao cái owner đê: ");
        this.owner = sc.nextLine();
        System.out.println("Nhập cho tao cái color đê: ");
        this.color = sc.nextLine();
        
        //Wrapper class + parse
        //Nhập vào 1 số thập phân và loại bỏ các kí tự lạ
        System.out.println("Nhập cho tao cái weight đê: ");
        this.weight = Double.parseDouble(sc.nextLine());
        
        System.out.println("Nhập cho tao cái necklace đê: ");
        this.necklace = sc.nextLine();
    }    
}
