package entity;

public class StudentV1 {
    //props
    private String id;
    private String fname;
    private String lname;
    private double score;
    
    //constructor
    public StudentV1(String id, String fname, String lname, double score) {
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
}
