package packfile;
import java.io.FileReader;
public class Readfromfile {
    void readData()
    {
        try {
            FileReader gh= new FileReader("nestedtry.txt");
             int i;
             while((i=gh.read())!= 1)
             System.out.print((char)i);
             gh.close();
        }
        catch (Exception e) {
            System.out.println(e);} 
    }
}
