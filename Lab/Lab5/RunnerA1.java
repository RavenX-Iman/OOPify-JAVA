package Lab5;
class Person {
    //parent class
    protected String name;
    protected String address;
    protected String ph_No;
    protected int id;

    Person(){
        name=null;
        address=null;
        ph_No=null;
        id=0;
    }
    Person(String n, String a,String p,int i){
        name=n;
        address=a;
        ph_No=p;
        id=i;
    }
    public void setName(String n){
        name=n;
    }
    public String getName (String n){
        return name;
    }
    public void  setAddress(String a){
        address=a;
    }
    public String getAdress(String a){
        return name;
    }
    public void setPh_No(String p){
        ph_No=p;
    }
    public String getPh_No(String p){
        return name;
    }
    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }
    // methods
    public void Display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Phone-no: "+ph_No);
        System.out.println("ID: "+id);

    }
}
class Student extends Person{
    //child class
    private String semester;
    private int roll_no;

    Student(){
        semester=null;
        roll_no=0;
    }
    Student(String n, String a,String p,int i,String s,int r){
        super(n, a, p, i);
        semester=s;
        roll_no=r;
    }
    public void setPh_No(String s){
        semester=s;
    }
    public String getPh_No(String s){
        return semester;
    }
    public void setId(int r) {
        roll_no = r;
    }
    public int getId() {
        return roll_no;
    }

    public void Display(){
        super.Display();
        System.out.println("Semester: "+semester);
        System.out.println("Roll-No: "+roll_no);
    }
}
public class RunnerA1{
    public static void main(String[] args) {
        // Person p1 = new Person();
        //we will not make object of parent class and not call it because we can call them from child class
        Student s1 = new Student("Aliza","xyz","12345",456,"3rd",1234);
        s1.Display();
        }
}
