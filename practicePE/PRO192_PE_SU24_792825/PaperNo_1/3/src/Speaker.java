public class Speaker {
    //props
    private String name;
    private int power;
    
    //constructor
    public Speaker(String name, int power) {
        this.name = name;
        this.power = power;
    }
    
    public Speaker() {
    }
    
    //getter
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
    
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
}
