package packfile;
import java.io.File;
public class Createfile {
    void newFile()
    {
try {
    
    File f= new File("null.txt");

    if(f.createNewFile()){
        System.out.println("file" + f.getName() + "is created successfully");
    }
    else {
        System.out.println("Otilo");
    }
    
    
    
} catch (Exception e) {
    System.out.println(e);
    
} 
}
}
