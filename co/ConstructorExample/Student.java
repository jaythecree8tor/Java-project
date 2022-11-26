package ConstructorExample;

public class Student {

    String name;
    int age;
    String mail;
    String address;
    String state;
     Student(int age)
    {
       this.age=20;
    }

     Student() 
    {

    }
    Student(int age, String name)
    {
       this.age= age;
       this.name= name;
    }
    Student( String name, String mail)
    {
       this.name= name;
       this.mail= mail;
    }
    Student(String name, int age, String mail, String address, String state){
        this.name= name;
        this.age= age;
        this.mail= mail;
        this.address= address;
        this.state= state;
    }
    void join(){
        System.out.println(name + age + mail + address + state);
    }
    void display(){
        System.out.println(name + (" ") + age);
    }
}