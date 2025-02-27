package theory;

class Distance {
    //defining data members
    private int feet;
    private int inches;
    //default constructor
    Distance(){
        feet=0;
        inches=0;
    }
    //parameterized constructor
    Distance(int f,int i){
        feet=f;
        inches=i;
    }
    //setter and getter for both feet and inch data members
    public void setFeet(int x){
        feet=x;
    }
    public int getFeet(){
        return feet;
    }
    public void setInches(int y){
        inches=y;
    }
    public int getInches(){
        return inches;
    }
    public void display(){
        System.out.println("Feet: "+feet);
        System.out.println("Inches: "+inches);
    }
    //
    Distance add(Distance D1){ // Distance is written instead of returntype we write the refrence class which is Distance
        Distance D3 = new Distance();
        D3.feet=this.feet + D1.feet;
        D3.inches = this.inches+D1.inches;
        return D3; //returns object D3

    }
}
public class Object_copy{
    public static void main(String[] args) {

    Distance D2 = new Distance(5, 9);
    Distance D4 = new Distance(6, 8);
    Distance D = D4.add(D2);
    D.display();
}
}