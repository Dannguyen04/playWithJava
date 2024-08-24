package runtime;

import entity.Dog;


public class Program {
    public static void main(String[] args) {
        Dog nDog = new Dog("001", "asa1234502602", "cc", 0, "cl");
        //nDog co phai ban the cua Dog 
        System.out.println(nDog.getOwner());
                
    }
}
