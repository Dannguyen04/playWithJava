package entity;
//PetManagement: là 1 cái khuôn tạo ra một anh quản lý 
//                    danh sách các con Pet

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import util.Inputter;

//anh quản lý này sẽ có các method giúp thao tác
//      với danh sách mà anh sẽ quản lý ở đây là quản lý Pet
/*
    1. Thêm mới 1 con chó
    2. Thêm mới 1 con mèo 
    3. In ra danh sách con pet "done"
    4. Tím kiếm pet theo id  "done"
        - nhận id tìm vị trí
        - nhận id tìm object 
        - xin id in object
    5. Update pet theo id 
    6. Remove pet theo id
    7. Sắp xếp pet theo trọng lượng "done"
    8. Lưu file và cút 
*/
public class PetManagement {
    //props
    ArrayList<Pet> petList = new ArrayList<>();
    
    //method init data
    public void initData(){
        petList.add(new Dog("D001", "Lue", "Red", 6.3, "Yélau"));
        petList.add(new Dog("D002", "Tài", "Yellow", 2.1, "cho tai"));
        petList.add(new Cat("C001", "Vinh", "Nâu", 4.2, "concat boi"));
        petList.add(new Cat("C002", "Shin", "Tím", 5.2, "cau be but chi"));
    }
    //method in danh sách
    public void showPetList(){
        if(petList.isEmpty()){
            System.out.println("Nothing to print");
            return;//ngừng luôn đếch cho đi tiếp 
        }
        System.out.println("----Pet List----");
        for (Pet item : petList) {
            item.showInfor();
        }
    }
    
    //method sắp xếp danh sách theo trọng lượng
    public void sortPetListByWeight(){
        //tạo trọng tài
        Comparator orderByWeight = new Comparator<Pet>() {
            @Override
            public int compare(Pet t1, Pet t2) {
                if(t1.getWeight() > t2.getWeight()){
                    return 1;
                }
                return -1;
            }
        };
        //nạp anh trọng tài vào danh sách
        Collections.sort(petList, orderByWeight);
        //sắp xếp không in ra 
        //sắp xếp không bao gồm hành động in ra
    }
    
    //method: nhận id tìm vị trí
    public int searchPetIndexById(String keyID){
        for(int i = 0; i <= petList.size() - 1; i++){
            if(petList.get(i).getId().equals(keyID)){
                return i;
            }
        }
        return -1;
    }
    
    //method: nhận id tìm object
    public Pet searchPetById(String keyID){
        int pos = searchPetIndexById(keyID);
        if(pos == -1){
            return null;
        }
        return petList.get(pos);
    }
    
    //method: xin id in object
    public void searhPetById(){ //sửa thêm hàm nhập
        String keyId = Inputter.getAString("Input id you wanna find", 
                                            "That field is required");
        Pet pet = this.searchPetById(keyId);
        if(pet == null){
            System.out.println("This pet not exist");
        }else{
            System.out.println("Pet In phò");
            pet.showInfor();
        }
    }
    
    //method: remove 
    public void removePetById(){
        String keyId = Inputter.getAString("Input id you wanna remove", 
                                            "That field is required");
        Pet pet = this.searchPetById(keyId);
        if(pet == null){
            System.out.println("This pet is not exist");
        }else{
            System.out.println("Pet Information deleting");
            pet.showInfor();
            petList.remove(pet);
            System.out.println("Remove is successful");
        }
    }
    
    //method: update
    public void updatePetById(){
        String keyId = Inputter.getAString("Input id you wanna update", 
                                            "That field is required");
        Pet pet = this.searchPetById(keyId);
        if(pet == null){
            System.out.println("This pet is not exist");
        }else{
            System.out.println("Pet in phò before updating");
            pet.showInfor();
            System.out.println("Updating");
            //cập nhật cái dễ trước
            //id là không được cập nhật
            //thu thập thông tin
            String nOwner = Inputter.getAString("Input new Owner", 
                                                "That field is required");
            String nColor = Inputter.getAString("Input new Color", 
                                                "That field is required");
            double nWeight = Inputter.getADouble("Input new weight", 
                                                "Try again đi cu, mày hơi ngu, như con cu", 
                                                1, 
                                                100);
            pet.setOwner(nOwner);
            pet.setColor(nColor);
            pet.setWeight(nWeight);
            
            //cập nhật cho necklace và ribbon
            if(pet instanceof Dog){
                //cập nhật necklace
                String nNecklace = Inputter.getAString("Input new Necklace", 
                                                "That field is required");
                ((Dog) pet).setNecklace(nNecklace);
            }else{
                String nRibbon = Inputter.getAString("Input new Ribbon", 
                                                "That field is required");
                ((Cat) pet).setRibbon(nRibbon);
            }
            
            System.out.println("Updating succecssful");
        }
    }
    
    //method: add new Dog
    public void addNewDog(){
        boolean isDup = false;
        String id; //id con chó mới
        do{
            isDup = false; //reset lại
            id = Inputter.getAString("Input your dog's id: ", 
                                     "Your id must match DXXX", 
                                     "[dD]\\d{3}").toUpperCase(); //d001 D001
            //hàm này có trả ra String nên .toUpperCase bth
            //check Trùng
            for (Pet item : petList) {
                if(item.getId().equals(id)){
                    isDup = true;
                    System.out.println("ID is duplicate");
                }
            }
        }while(isDup);
        //thu thập thông tin khác ngoài id cho chó
        String Owner = Inputter.getAString("Input new Owner", 
                                                "That field is required");
        String Color = Inputter.getAString("Input new Color", 
                                            "That field is required");
        double Weight = Inputter.getADouble("Input new weight", 
                                            "Try again đi cu, mày hơi ngu, như con cu", 
                                            1, 
                                            100);
        String necklace = Inputter.getAString("Input necklace", 
                                              "That field is required");
        //tạo dog
        Dog nDog = new Dog(id, Owner, Color, Weight, necklace);
        petList.add(nDog);
        System.out.println("Adding Dog is successful");
    }
    
    //method: add new Cat
    public void addNewCat() {
        boolean isDup = false;
        String id; //id cho con chó mới 
        do{
            isDup = false; //reset lại
            id = Inputter.getAString("Input your cat's ID", 
                                     "Your id must to match CXXX",
                                     "[cC]\\d{3}").toUpperCase(); //d001  D001
            //hàm này trả ra String có thể .toUpperCase bình thường 
            //check trùng
            for (Pet item : petList) {
                if(item.getId().equals(id)){
                    isDup = true;
                    System.out.println("Id is duplicate");
                }
            }
        }while(isDup);
        //thu thập thêm thông tin khác ngoài id cho pet Dog
        String owner = Inputter.getAString("Input owner:", 
                                            "That field is required!!!");
        String color = Inputter.getAString("Input color:", 
                                            "That field is required!!!");
        double weight = Inputter.getADouble("Input weight: ", 
                                            "That field is required!!!");
        String ribbon = Inputter.getAString("Input ribbon:", 
                                            "That field is required!!!");
        //tạo Dog
        Cat nCat = new Cat(id, owner, color, weight, ribbon);
        petList.add(nCat);
        System.out.println("Adding Cat is successful");
    }
    
    //còn thiếu hàm loadFormFile và SaveToFile
}
