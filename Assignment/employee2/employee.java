package Assignment.employee2;

public class employee {
    String name="Jhon doe";
    int id= 444;
    String position= "Senior Dev";
    double salary=5500.45;
/* First method*/
public int firstMethod(){
    System.out.println("Name: " + name + "\nId: " + id + "Position: " + position + "\nSalary: " + salary);
    return 021;
}

/*Second method */
public double secondMethod(){
    System.out.println("Name: " + name + "\nId: " + id + "Position: " + position + "\nSalary: " + salary);
    return 99.6;
}

/*Third method */
public String thirdMethod(){
    System.out.println("Name: " + name + "\nId: " + id + "Position: " + position + "\nSalary: " + salary);
    return "\nHello...Here's our employee details";
}

/*Fourth method */
public void fourthMethod(){
  System.out.println("This is our fourth method");
}

/*Fifth method */
public employee showObject(String name){
  this.name = name;
  return this;
}

/*Sixth methode */
public employee showObject1(int age)
{
  this.id = age;
  return this;
}

/*Seventh method */
public employee showObject2(String position)
{
  this.position = position;
  return this;
}
}
