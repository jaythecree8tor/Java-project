package EmployeeExample;

public class Employee {
    int empNum;
    int empId;
    String empName;
    String department;
    String email;
    double salary;
   Employee(){

   }
   Employee(int a){
       this.empNum=a;
   }
   Employee(int empNum, int empId, String empName){
    this.empNum= empNum;
   }
   Employee(int empNum, int empId, String empName, String department){
    this.empNum= empNum;
   }
   Employee(int empNum, int empId, String empName, String department, String email, double salary ){
    this.empNum= empNum;
    this.empId= empId;
    this.empName= empName;
    this.department= department;
    this.email= email;
    this.salary= salary;
   }
   void EmployeeDisplay(){
       System.out.println("Number: " + empNum + "\nID: " + empId +  "\nName: " + empName +  "\nDepartment: " + department + "\nEmail: " + email + "\nSalary: " + salary) ;
   }
}
