package Lab_1;
class Student {
    // Data Members
    private String s_name;
    private int age;
    private int s_id;
    private String s_dept;
    private String gender;
    private String email;
    private String p_no;
    private String program;
    private int sem;
    private String[] courses;

    // Getter and Setter Methods
    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_dept() {
        return s_dept;
    }

    public void setS_dept(String s_dept) {
        this.s_dept = s_dept;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getP_no() {
        return p_no;
    }

    public void setP_no(String p_no) {
        this.p_no = p_no;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student ID: " + s_id);
        System.out.println("Name: " + s_name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + s_dept);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + sem);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + p_no);
        System.out.println("Gender: " + gender);
        System.out.println("Courses Enrolled: ");
        if (courses != null) {
            for (String course : courses) {
                System.out.println("- " + course);
            }
        } else {
            System.out.println("No courses enrolled.");
        }
    }
}

public class University_ManagementSystem {
    public static void main(String[] args) {
        // Creating Student Object
        Student student1 = new Student();
        
        // Setting values using setter methods
        student1.setS_id(101);
        student1.setS_name("Spider Man");
        student1.setAge(20);
        student1.setS_dept("Computer Science");
        student1.setProgram("BSCS");
        student1.setSem(3);
        student1.setEmail("abc.xyz@university.edu");
        student1.setP_no("0312-3456789");
        student1.setGender("male");
        student1.setCourses(new String[]{"OOP", "Operating Systems", "Computer Networks"});

        // Displaying Student Information
        student1.displayStudentInfo();
    }
}
