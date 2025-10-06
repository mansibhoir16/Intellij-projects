package Collections;

class EmployeeData {
    int id;
    String Name;

    public  EmployeeData(){
        id =23;
        Name ="Mansi";
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return Name;
    }
}
public class ConstructorsTypes {



    public static void main(String args[]){

        EmployeeData EmpDetails = new EmployeeData();
        System.out.println(EmpDetails.getId());
        System.out.println(EmpDetails.getName());

    }
}
