package runtime;

import entity.Author;
import entity.Book;
import java.util.ArrayList;
import util.Inputter;

public class Program {
    public static void main(String[] args) {
        
        //test nhập ngày 
        String check = Inputter.getADate("Nhập ngày theo đúng kiểu d-m-y", 
                                         "Nhập sai rồi cu", 
                                         "dd/MM/yyyy");
        System.out.println(check);
        
        
        
        ArrayList<Author> auList = new ArrayList<>();
        ArrayList<Book> boList = new ArrayList<>();
        initData(auList, boList);
        int choice;
        do{
            showMenu();
            //getChoice
            choice = Inputter.getAnInteger("Nhập lựa của mày đi thằng ngu: ", 
                                           "Lựa chọn không hợp lệ!!!",  
                                           1, 5);
            //thực thi chức năng 
            switch(choice){
                case 1:{
                    Book newBook = new Book();
                    newBook.inputInfor(); //nhập bookname, createAt, nickname
                    boList.add(newBook); //nhét sách mới vào danh sách
                    
                    //tìm xem có tác giả có nickName giống sách không 
                    boolean isFind = false;
                    for (Author author : auList) {
                        if(author.getNickname().equals(newBook.getNickName())){
                            isFind = true;
                        }
                    }
                    
                    if(!isFind){
                        //tạo mới tác giả
                        //bởi vì khi nhập sách mới đã có bút danh của tác giả 
                        //mắc cái qq gì mình phải cho người dùng nhập 1 lần nữa?
                        //=> dùng phễu chỉ drop nickname
                        //      kết hợp với hàm inputInfor cho name và yob thôi
                        Author newAuthor = new Author(newBook.getNickName());
                        newAuthor.inputInfor(); //nhập name, yob 
                        auList.add(newAuthor);
                    }
                    break;
                }
                case 2:{
                    for (Book book : boList) {
                        book.showInfor();
                    }
                    break;
                }
                case 3:{
                    Author newAuthor = new Author();
                    newAuthor.inputInfor(auList);//nhập nickname, name, yob
                    break;
                }
                case 4:{
                    String key = Inputter.getAString("Mày muốn tìm sách của nickname nào? ", 
                                                     "Nhập ngu vãi cứt");
                    boolean isFind = false;
                    for (Book book : boList) {
                        if(book.getNickName().equals(key)){
                            book.showInfor();
                            isFind = true;
                        }
                    }
                    
                    if(!isFind){
                        System.out.println("Không có thông tin của tác giả đó");
                    }
                    break;
                }
                case 5:{
                    System.out.println("Cút tao không biết concat!!!");
                    break;
                }
            }
        }while(choice != 5);

    }
    public static void showMenu(){
        System.out.println("1.Nhập thông tin sách in ra màn hình");
        System.out.println("2.Hiển thị thông tin sách ra màn hình");
        System.out.println("3.Nhập thông tin tác giả");
        System.out.println("4.Tìm kiếm sách theo bút danh");
        System.out.println("5.Thoát");
    }
    public static void initData(ArrayList<Author> auList, 
                                ArrayList<Book> boList){
        auList.add(new Author("Nguyễn Việt Hoàng", "HoangHau", 2002));
        auList.add(new Author("Nguyễn Thùy Chi", "Chipug", 1994));
        auList.add(new Author("Nguyễn Tiến Đạt", "Dannguyen", 2004));
        
        boList.add(new Book("Chào các bông hoa nhỏ ham học", "11-03-2024", "Dannguyen"));
        boList.add(new Book("Đừng làm mọi thứ phức tạp", "11-03-2024", "Chipug"));
        boList.add(new Book("Vinh ngắn quá, phải concat thôi", "11-03-2024", "Hoanghau"));
    }
}
/*
tạo chương trình quản lý thư viện
gồm 2 class sau
muốn biết nào cha nào con thì dùng kỹ thuật IS A
Author is a Book => sai
Author
    name 
    nickname 
    yob
    -------------------------------------
    tạo Phễu hàm không parameter 
    tạo Phễu có parameter 
    tạo Phễu có parameter là name
    tạo getter không tạo setter
    tạo hàm nhập thông tin tác giả
    nhưng nếu tác giả đã tồn tại trong danh sách thì hong chịu
    ép nhập lại
    tạo hàm showInfor
Book
    bookName 
    createAt 
    nickName(author)
    -------------------------------------
    tạo Phễu có parameter và không có parameter 
    tạo getter anh setter
    tạo hàm input//nếu mà sách này có tác giả mà có tên trong danh sách tác giả thì bỏ qua
    nếu tác giả của cuốn sách mà chưa có tồn tại trong danh sách thì thêm mới
program:
    menu
    1.Nhập thông tin sách in ra màn hình
    2.Hiển thị thông tin sách ra màn hình
    3.Nhập thông tin tác giả
    4.Tìm kiếm sách theo bút danh
    5.Thoát
*/ 