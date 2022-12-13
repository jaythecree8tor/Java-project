package packfile;
import java.io.FileWriter;
public class Writetofile {
 public   void writeData()
    {
        try 
        {
    
        try (FileWriter righty = new FileWriter("werey.txt")) {
            righty.write("otilo");
        }
            
        } 
        catch (Exception e) {
            System.out.println(e);
            
        } 
    }
}
