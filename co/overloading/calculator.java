package overloading;
public class calculator {
    int firstNum=10;
    int secondNum=20;
    int result;

   public void add()
       {
           result=firstNum+secondNum;
        //    System.out.println(result);
       }
       //method overloading
   public void add(int thirdNum)
       {
           result=firstNum+secondNum+thirdNum;
           System.out.println(result);
       }
       public    void add(int thirdNum, int frtNum)
       {
           result=firstNum+secondNum+thirdNum+frtNum;
           System.out.println(result);
       }
       public void add(int id, String name, double salary)
       {
           System.out.println(id + name + salary);
       }
}