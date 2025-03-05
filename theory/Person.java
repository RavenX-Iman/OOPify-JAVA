package theory;
//creating a class
public class Person {
    //declaring variables/attributes of person class
    public String name;
    public int id;
    public int age;

    //creating a constructor(without parameters)
    Person(){
        //initializing variables to null and 0
        name=null;
        id=0;
        age=0;
    }
    //main method to create object of person class
    public static void main(String[] args) {
        //creating object of person class
        //person class is returntype                    
                        //person constructor is called   
        Person Ali = new Person();
        System.out.println("ID:"+Ali.id);//.id is used to access the id of Ali object
        System.out.println("Name:"+Ali.name);
        System.out.println("Age:"+Ali.age);
    }
}
