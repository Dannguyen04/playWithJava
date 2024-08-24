package runtime;

import entity.PetManagement;
import ui.Menu;

public class PetCareSystem {
    public static void main(String[] args) {
        PetManagement pm = new PetManagement();
        //trong java có quy luật tất cả mọi hành động đều có người chịu trách nhiệm
        //nên PetManagement chính là người quản lý để làm những công việc như thêm
        //      xóa sửa
        //nên Menu cũng thế cũng cần phải có người quản lý menu
        Menu menu = new Menu("Pet Care System Menu");
        
        menu.addNewOption("Add New Dog");
        menu.addNewOption("Add New Cat");
        menu.addNewOption("Show Pet List");
        menu.addNewOption("Search Pet By ID");
        menu.addNewOption("Update Pet By ID");
        menu.addNewOption("Remove Pet By ID");
        menu.addNewOption("Sort Pet List Order By Weight");
        menu.addNewOption("Save File And Cuk");
        
        int choice; //lưu lựa chọn của người dùng
        while(true){
            menu.print();
            choice = menu.getChoose(); //mời người dùng nhập lựa chọn
            //xử lý lựa chọn
            switch(choice){
                case 1:{
                    pm.addNewDog();
                    break;
                }
                case 2:{
                    pm.addNewCat();
                    break;
                }
                case 3:{
                    pm.showPetList();
                    break;
                }
                case 4:{
                    pm.searhPetById();
                    break;
                }
                case 5:{
                    pm.updatePetById();
                    break;
                }
                case 6:{
                    pm.removePetById();
                    break;
                }
                case 7:{
                    pm.sortPetListByWeight();
                    break;
                }
                case 8:{
                    System.out.println("Cúc");
                    break;
                }
            }
        }
    } 
}
