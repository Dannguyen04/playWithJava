package data;

//data là nơi lưu trữ các bộ khuôn(class)
//cái khuôn đầu tiên tên là Star(Class)
//cái khuôn này dùng để đúc ra các người nổi tiếng(object): MC-suy, Jack, Chipug
//một object cần attribute(thuộc tính) và method(hành động)
//hành động nằm bên trong class thì mình gọi là method(phương thức)

public class Star { //đây chính là cái khuôn
    //props|field|attribute
    private String name;
    private int yob;
    public static String gender;
    private String hotSong;
    
/*
    Chế cái phễu để nhận giá trị từ người dùng và rót vào những cái ngăn tương ứng
    constructor: cái phễu - hàm - method:
        1. phễu phải để public để ai cũng có thể đúc được, ai cũng có thể dùng được
        2. phễu phải cùng tên với class
    this: tự truy vấn chính mình, là class chứa nó, giống con trỏ trong C
*/
    //constructor
    public Star(String newName, int yob, String gender, 
                    String hotSong){ //giá trị người dùng sẽ đưa cho mình
        name = newName; //name = inpName;
        this.yob = yob;
        this.gender = gender;
        this.hotSong = hotSong;
    }    
    
    //getter và setter
    public String getName(){ //ai gọi hàm này thì sẽ nhận được giá trị của name
        return this.name;    // cho dù nó có private
    }
    
    public void setName(String newName, int pwd){
        if(pwd == 1){
            this.name = newName;
        }
    }
    
    //method
    public void showInfor(){
        System.out.println(" Tôi tên " + name +
                            " Tôi sinh "+ yob + 
                            " Tôi là " + gender +
                            " Hot Song " + hotSong);
    }
}
