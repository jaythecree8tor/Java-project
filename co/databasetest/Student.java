package databasetest;
import java.util.Scanner;
public class Student{
        String id;
        String name;
        String age;
        String state;

    void getData()
    { 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Student Id");
        id = input.next();
        System.out.println("Enter Student Name");
        name = input.next();
        System.out.println("Enter Student Age");
        age = input.next();
        System.out.println("Enter Student State");
        state = input.next();
        input.close();
    }
}
