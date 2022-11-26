import java.util.Scanner;
import java.io.IOException;
public class Interview {
  public static void main(String[] args) throws InterruptedException,IOException {
    Scanner inputing = new Scanner(System.in);
    /* Declaring my variable */
    String fullName;
    String mobilePhone;
    String Email;
    int Age;
    String opt;
    System.out.println("\t======Welcome your Interview======");
    System.out.println("Please hold on......");
    Thread.sleep(4000);
    new ProcessBuilder( "clear").inheritIO().start();
    System.out.println("\t======Welcome your Interview======");
    System.out.println("ARE YOU READY FOR THIS QUESTIONS?");
    opt = inputing.nextLine();
    if (opt.equals("Yes") || (opt.equals("yes") || (opt.equals("YES")))) {
      System.out.println("Thanks for choosing " + opt);
    } else if (opt.equals("no") || (opt.equals("No")) || (opt.equals("NO"))) {
      System.out.println("Thank you dear user, we really appreciate your decision.");
    } else {
      System.out.println("INVALID INPUT!!!");
    }
    System.out.println("Please kindly input your age!");
    Age = inputing.nextInt();
    if (Age >= 23) {
      Scanner pelumi = new Scanner(System.in);
      System.out.println("Welcome dear user, kindly input your firstname and last name!");
      fullName = pelumi.nextLine();
      System.out.println(fullName + " Please input your mobile line");
      mobilePhone = pelumi.nextLine();
      System.out.println(fullName + " Please input your Email");
      Email = pelumi.nextLine();
      System.out.println("Thank For All The Information, we will get back to you soon (-_-)");
      displayInformation(fullName, mobilePhone, Email);
      pelumi.close();
    } else {
      System.out.println("Dear user at age " + Age + " you are not allowed to use this service (*_*) you must be 23 years old and above.");
    }
    inputing.close();
  }
  public static void displayInformation(String Firstname, String mobilePhone, String Email){
      System.out.println(Firstname);
  }
}
