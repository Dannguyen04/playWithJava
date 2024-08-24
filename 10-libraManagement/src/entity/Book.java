package entity;

import java.util.Scanner;
import util.Inputter;

public class Book {
    //props
    private String bookName; 
    private String createAt;
    private String nickName;
    
    //constructor
    public Book(String bookName, String createAt, String nickName) {
        this.bookName = bookName;
        this.createAt = createAt;
        this.nickName = nickName;
    }
    public Book() {
    }
    
    //getter
    public String getBookName() {
        return bookName;
    }

    public String getCreateAt() {
        return createAt;
    }

    public String getNickName() {
        return nickName;
    }
    
    //method inputInfor
    public void inputInfor(){
        this.bookName = Inputter.getAString("Nhập tên của sách", 
                                            "Nhập ngu vãi cứt");
        this.createAt = Inputter.getAString("Nhập ngày tạo", 
                                            "Nhập ngu vãi cứt");
        this.nickName = Inputter.getAString("Nhập bút danh của tác giả", 
                                            "Nhập ngu vãi cứt");
    }

    //method showInfor
    public void showInfor(){
        System.out.printf("%-30s|%-15s|%-20s\n", bookName, createAt, nickName);
    }
}
/*
Book
    bookName 
    createAt 
    nickName(author)
    -------------------------------------
    tạo Phễu có parameter và không có parameter 
    tạo getter anh setter
    tạo hàm input
    nếu mà sách này có tác giả mà có tên trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong danh sách thì thêm mới
*/