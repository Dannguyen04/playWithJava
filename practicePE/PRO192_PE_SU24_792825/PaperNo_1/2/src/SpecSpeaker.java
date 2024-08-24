public class SpecSpeaker extends Speaker{
    //props
    private String sound;
    
    //constructor
    public SpecSpeaker() {
    }

    public SpecSpeaker(String name, int power,  String sound) {
        super(name, power);
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Speaker{" + "name=" + name + ", sound=" + sound + ", power=" + power + '}';
    }

    public void setData(){
        name = name.substring(0, name.length() - 1);
    }
    
    public String getValue(){
        if(power > 10){
            return sound;
        }else{
            return sound + power; 
        }
    }
}
