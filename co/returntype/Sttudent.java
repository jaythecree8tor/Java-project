package returntype;

public class Sttudent {
    String nname="Pelumi";
    int aage=50;

   public Sttudent display()
    {
        System.out.println(nname+aage);
        return this;
    }

   public int showData()
    {
        System.out.println(nname+aage);
        return 10;
    }


    public double showMessage()
    {
        System.out.println(nname+aage);
        return 8.44;
    }

    public String showString()
    {
        System.out.println(nname+aage);
        return "Hello!...welcome to the world of java";
    }

    public Sttudent displayObject()
    {
        System.out.println(nname+aage);
        return this;
    }
}