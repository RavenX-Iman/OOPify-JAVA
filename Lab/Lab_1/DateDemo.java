package Lab_1;
class Date { 
    //properties of the date-class
    public String month; 
    public int day; 
    public int year; //a four digit number. 
 
    //method of date-class
    public void displayDate() { 
        System.out.println(month + " " + day + ", " + year); 
    } 
} 
 
public class DateDemo { 
 
    public static void main(String[] args) { 
        //Date date1 = new Date();
        //Date date2 = new Date();
        Date date1, date2; //declaration of 2 objects at same time of date-class
        //instantaniation of date1 object
        date1 = new Date(); 
        date1.month = "December"; 
        date1.day = 31; 
        date1.year = 2012; 
        System.out.println("date1:"); 
        date1.displayDate(); 

        //instantaniation of date2 object
        date2 = new Date(); 
        date2.month = "July"; 
        date2.day = 4; 
        date2.year = 1776; 
        System.out.println("date2:"); 
        date2.displayDate(); 
    } 
}