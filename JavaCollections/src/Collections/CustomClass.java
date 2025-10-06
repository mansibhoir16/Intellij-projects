package Collections;
 class Employee{

    int id;
    String name;
    double salary;
    private int age;
    private String caste;

    //create getters and setters
     public int getAge(){
         return age;
     }
    public String getCaste(){
         return caste;
    }
    public void setAge(int a){
         a= age;
    }
    public void setCaste(String c){
         c = caste;
    }
    public void getdetails(){
        System.out.println("My name is "+name);
        System.out.println("My id is "+id);
    }

    public void getsalary(){

        System.out.println("My Salary is "+salary);
    }
}
public class CustomClass {


    public static  void main(String args[]){
        Employee Mansi = new Employee();
        Mansi.id =12;
        Mansi.name ="Mansi";
        Mansi.salary= 100000;
        Mansi.setAge(25);
        Mansi.setCaste("OBC");

        Mansi.getdetails();
        Mansi.getsalary();
        Mansi.getAge();
        Mansi.getCaste();



    }
}
