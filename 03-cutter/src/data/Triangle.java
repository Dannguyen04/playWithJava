package data;

public class Triangle {
    //props
    protected double edgeA;
    protected double edgeB;
    protected double edgeC;
    //private double perimeter;
    //không nên lưu trữ chu vì hay thuộc tính:
    //1. Nếu mình tạo ra nó và mình lưu trữ mình sẽ có getter
    //              setter => người ta sẽ chỉnh sửa được giá trị của chu vi
    //2. Diện tích hoặc chu vi mình có thể tính từ 3 cạnh nên không cần lưu
    //              nào mình cần dùng chỉ cần tính và gọi method
    
    //phễu - constructor
    public Triangle(double newEdgeA, double edgeB, double edgeC) {
        edgeA = newEdgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    //getter
    public double getEdgeA() {
        return edgeA;
    }//cần thì gọi để lấy giá trị ra để xài

    public double getEdgeB() {
        return edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }
    
    //setter
//    public void setEdgeA(double newEdgeA) {
//        this.edgeA = newEdgeA;
//    }//cần thì gọi để chỉnh lại giá trị của cạnh A
    
    
    //method getPerimeter: chu vi
    public double getPerimeter(){
        return edgeA + edgeB + edgeC;
    }
    
    //method getArea: diện tích
    public double getArea(){
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - edgeA) * (p - edgeB) * (p - edgeC));
    }
    
    //method draw - showInfor
    public void draw(){
        String str = String.format("Triangle  |%5.2f|%5.2f|%5.2f|%5.2f|%5.2f", 
                                    edgeA,edgeB,edgeC,getPerimeter(),getArea());
        System.out.println(str);
    }
}
