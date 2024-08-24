package entity;
//StudentV2 là cái khuôn đúc sinh viên nhưng có tính gato

//Comparable: tính đố kỵ interface
//  chứa abs method: compare
//Comparable:  hội những người thích đố kỵ
public class StudentV2 implements Comparable<StudentV2>{
    //props
    private String id;
    private String fname;
    private String lname;
    private double score;
    
    //constructor
    public StudentV2(String id, String fname, String lname, double score) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.score = score;
    }
    
    //getter
    public String getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public double getScore() {
        return score;
    }

    //method showInfor
    public void showInfor(){
        String str = String.format("%-11s|%-11s|%-11s|%5.2f", 
                                id, fname, lname, score);
        System.out.println(str);
    }

    @Override
    public int compareTo(StudentV2 that) {
        if(this.getId().compareTo(that.getId()) > 0){
            return 1;
        }
        return -1;
    }
}
