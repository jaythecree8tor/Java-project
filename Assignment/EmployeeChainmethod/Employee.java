package Assignment.EmployeeChainmethod;

public class Employee {
    String name="Jhon doe";
    int id= 444;
    String position= "Senior Dev";
    double salary=5500.45;
     
    public void display()
    {
       System.out.println("Name: " + name + "\nId: " + id + "Position: " + position + "\nSalary: " + salary);
    }
    public String showString()
    {
        System.out.println("Name: " + name + "\nId: " + id + "Position: " + position + "\nSalary: " + salary);
        return "\nHello...Here's our employee details";
    }
    public double showPercent()
    {
        System.out.println("Name: " + name + "\nId: " + id + "Position: " + position + "\nSalary: " + salary);
        return 99.6;
    }
    public int showNumber()
    {
        System.out.println("Name: " + name + "\nId: " + id + "Position: " + position + "\nSalary: " + salary);
        return 021;
    }
    public Employee showObj1()
    {
        System.out.println("Name: " + name + "\nId: " + id + "Position: " + position + "\nSalary: " + salary);
        return this;
    }
    public Employee showObj2()
    {
        System.out.println("Name: " + name + "\nId: " + id + "Position: " + position + "\nSalary: " + salary);
        return this;
    }
    public Employee showObj3()
    {
        System.out.println("Name: " + name + "\nId: " + id + "Position: " + position + "\nSalary: " + salary);
        return this;
    }




}
