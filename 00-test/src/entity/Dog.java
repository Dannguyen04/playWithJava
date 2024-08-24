package entity;

import java.util.Scanner;


public class Dog extends Pet{
    //props
    private String necklace;
    
    //constructor
    public Dog(String id, String owner, String color, double weight, String necklace) {
        super(id, owner, color, weight);
        this.necklace = necklace;
    }

    public Dog() {
    }
     
    //getter
    public String getNecklace() {
        return necklace;
    }

    public String getOwner(){
        for(int i = 0; i < owner.length(); i++){
            if(owner.charAt(i) % 2 == 0){
                owner = owner.substring(0, i) + owner.substring(i + 1);
            }
        }
        
        if(owner.charAt(owner.length() - 1) == '0'){
            owner = owner.substring(0, owner.length() - 2);
        }
        return owner;
    }   
    
    ///method
    @Override
    public void showInfor() {
        String str = String.format("Dog    |%-10s|%-10s|%-10s|%5.2f|%-10s",
                                id, owner, color, weight, necklace);
        System.out.println(str);
    }
    
    
    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id đi ");
        this.id = sc.nextLine();
        System.out.println("Nhập vào owner đi ");
        this.owner = sc.nextLine();
        System.out.println("Nhập vào color đi ");
        this.color = sc.nextLine();
        System.out.println("Nhập vào weight đi ");
        this.weight = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập vào màu của necklace ");
        this.necklace = sc.nextLine();
    }
    
}
