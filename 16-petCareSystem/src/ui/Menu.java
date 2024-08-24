package ui; //ui là user interface
import java.util.ArrayList;
import util.Inputter;


/*
    - Menu: là 1 cái khuôn chuyên đúc ra object quản lý menu
            cái khuôn này chứa 1 danh sách các lựa chọn (option)
    - method addNewOption
    - method print
    - method getChoose
*/
public class Menu {
    //props
    public ArrayList<String> optionList = new ArrayList<>();
    public String title;
    
    //constructor
    public Menu(String title) {
        this.title = title;
    }
    
    //method addNewOption: thêm chức năng
    public void addNewOption(String nOption){
        optionList.add(nOption);
    }
    
    //method print: in ra danh sách các lựa chọn
    public void print(){
        int count = 1; //đánh số cho menu
        System.out.println("-----" +title+ "----");
        for (String item : optionList) {
            System.out.println(count + "." + item);
            count++;
        }
    }
    
    //method getChoose: xin lựa chọn
    public int getChoose(){
        return Inputter.getAnInteger("Input your choice: ", 
                                    "Your choice must to between 1 and "
                                        + optionList.size(), 
                                    1, 
                                    optionList.size());
    }
}
