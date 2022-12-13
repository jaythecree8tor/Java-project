package packfile;

public class Filehandling {
    public static void main(String[] args) {
        Createfile obj= new Createfile();
        Writetofile obf= new Writetofile();
        obf.writeData();
        obj.newFile();
    }
}
