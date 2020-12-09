package com.builderPattern;

public class AddEmployee {
    public static void main(String[] args){
        Employee newEmp= new Employee("Chanaka", 26, "nugegoda, 10250", 41620477, "SE");
        System.out.println("newEmp : "+ newEmp);

        Employee newEmp1= new EmployeeBuilder().setName("Saman").setAge(20).getEmployee();
        System.out.println("newEmp1 : "+newEmp1);
    }
}
