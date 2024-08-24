package entity;

import java.util.ArrayList;
import util.Inputter;

public class Author {
    //props
    private String name;
    private String nickname; 
    private int yob;
    
    //constructor
    public Author(String name, String nickname, int yob) {
        this.name = name;
        this.nickname = nickname;
        this.yob = yob;
    }
    public Author(String nickname) {
        this.nickname = nickname;
    }
    public Author() {
    }
    
    //getter
    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getYob() {
        return yob;
    }
    
    //method inputInfor
    public void inputInfor(){
        this.name = Inputter.getAString("Nhập tên: ", 
                                        "Nhập sai rồi cu");
        this.yob = Inputter.getAnInteger("Nhập năm sinh: ", 
                                         "Nhập ngu vãi cứt");
    }
    
    //overload: nickName(cấm trùng), name, yob
    public void inputInfor(ArrayList<Author> authorList){ //nhập nick name
        while(true){
            String inputNickname = Inputter.getAString("Nhập nickName(bút danh):", 
                                                       "Nhập ngu vãi cứt");
            boolean isDup = false;
            for (Author author : authorList) {
                if(author.getNickname().equals(inputNickname)){
                    isDup = true;
                }
            }
            if(isDup){
                System.out.println("Bút danh bị trùng rồi thằng ngu");
            }else{
                this.nickname = inputNickname;
                this.inputInfor();
                break;
            }
        }
    }
    
    //method showInfor
    public void showInfor(){
        String str = String.format("%-25s|%-25s|%5d", name,nickname,yob);
        System.out.println(str);
    }
    
}
