public class Tofu {
    //props
   private String maker;
   private int quantity; 
   
   //constructor
    public Tofu(String maker, int quantity) {
        this.maker = maker;
        this.quantity = quantity;
    }
    public Tofu() {
    }
    
    //getter
    public String getMaker() {
        maker = maker.substring(0, 1).toLowerCase() + maker.substring(1, maker.length() - 1) 
                                        + maker.substring(maker.length() - 1).toLowerCase();
        return maker;
    }

    public int getQuantity() {
        return quantity;
    }
    
    //setter 
    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
}
