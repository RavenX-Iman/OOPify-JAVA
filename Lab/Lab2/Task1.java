package Lab2;
class Circle{
    public double radius;
    Circle(){
        radius=0.0;
    }
    Circle(double r){
        radius=r;
    }
    public void circumference(){
        double circ=2*3.146 *radius;
        System.out.println(circ);
    }
}
public class Task1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.circumference();
        Circle c1 = new Circle(5);
        c1.circumference();
    }
    
}
