public class Speaker {
    //props
    protected String name;
    protected int power;
    
    //constructor
    public Speaker() {
    }
    
    public Speaker(String name, int power) {
        this.name = name;
        this.power = power;
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
    
    //toString
    @Override
    public String toString() {
        return "Speaker{" + "name=" + name + ", power=" + power + '}';
    }
}
