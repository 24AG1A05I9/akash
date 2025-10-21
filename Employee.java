import java.util.*;
//constrtor overloading
class Employee{
    String empName;
    int empID;

    //construtor with only empName
    Employee(String name){
        empName = name;
    }
    //construtor with both empName and empID
    Employee(String name,int id){
        empName = name;
        empID = id;
    }
    void display(){
        System.out.println(empName);
        System.out.println(empID);
    }
    public static void main(String[] args){
        Employee e1 = new Employee("AKASH");
        Employee e2 = new Employee("ACE CLD",101);
        e1.display();
        e2.display();
    }

}