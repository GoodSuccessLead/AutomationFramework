package Util;

import java.io.*;

public class fileLog  {
    public void filetxt() throws FileNotFoundException {
        try{
            // Create new file
            String content = "test";
            String path="C:\\Anderson Cabana\\Proyectos\\Versiones_Proyecto\\v1.3\\Demo_Automatizacion\\Historial\\LogFile.txt";
            File file = new File(path);

            // If file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            // Write in file
            bw.write(content);
            // Close connection
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
