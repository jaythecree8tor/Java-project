import java.util.Scanner;
public class Addition 
{
    int firstNumber=10;
    int secondNumber=20;
    int result;
    Scanner input=new Scanner(System.in);
    void add()
    {
        System.out.println("\n Addition");
        System.out.println("Enter your first number: ");
        firstNumber=input.nextInt();
        System.out.println("Enter your second number: ");
        secondNumber=input.nextInt();
        result=firstNumber+secondNumber;
        System.out.println("\n Your answer is");
        System.out.println(result);
    }
    void multiply()
    {
        System.out.println("\n Multiplication");
        System.out.println("Enter your first number: ");
        firstNumber=input.nextInt();
        System.out.println("Enter your second number: ");
        secondNumber=input.nextInt();
        result=firstNumber*secondNumber;
        System.out.println("\n Your answer is");
        System.out.println(result);
    }
    public static void main(String[] args) {
    }
}