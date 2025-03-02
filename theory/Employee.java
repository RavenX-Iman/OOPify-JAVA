package theory;
//class declaration
public class Employee {
    //fields(state)
    String name;
    float salary;

    //method to get employee details(behaviour)
    void setDetails(String n,float s){
        name=n;
        salary=s;
    }
    //method to dispaly employee details(behaviour)
    void getDetails(){
        System.out.println("Name: "+name);
        System.out.println("Salary:"+salary);
    }

    public static void main(String[] args) {
        //object creation
        Employee emp = new Employee();
        //setting values of object
        emp.setDetails("Abc", 1200.0f);
        //displaying values of object
        emp.getDetails();
    }
    
}
