
import java.util.List;

public class MySpeaker implements ISpeaker{
    @Override
    public int f1(List<Speaker> t) {
        int count = 0;
        for (Speaker speaker : t) {
            if(speaker.getPower() > 10){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Speaker> t) {
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = i + 1; j < 4; j++) {
                if(t.get(i).getPower() > t.get(j).getPower()){
                    Speaker temp = t.get(i);
                    t.set(i, t.get(j));
                    t.set(j, temp);
                }
            }
        }
    }

    @Override
    public void f3(List<Speaker> t) {
        int count = 0;
        int min = t.get(0).getPower();
        for (Speaker speaker : t) {
            if(speaker.getPower() < min){
                min = speaker.getPower();
            }
        }
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getPower() == min){
                count++;
            }
            if(count == 2){
                t.remove(i);
                break;
            }
        }
    }
    
}
