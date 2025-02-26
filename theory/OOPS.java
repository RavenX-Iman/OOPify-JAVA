package theory;
//class is a blueprint of an object
//object is an instance of a class.
class Pen{
    String color;
    String type;
    int price;
    // pen(){ //default constructor
    //     color=null;
    //     type= null;
    //     price=0;
    // }
    // pen(String color,String type,int price){ //parameterized constructor
    //     this.color=color;
    //     this.type=type;
    //     this.price=price;
    // }
    public void write(){
        System.out.println("Writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }

}
public class OOPS{
    public static void main(String[] args) {
        Pen pen1 = new Pen(); //creating an object of class pen
        pen1.color="Blue";
        pen1.type="Gel-pen";
        pen1.price=10;
        pen1.write();
        pen1.printcolor();


    }
}