
/**
 * Write a description of class Reader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Tool
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Reader
     */
    public Tool()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String bacaFile(String path) throws IOException
    {
        String myData="";
        FileInputStream fis = new FileInputStream(path);
        DataInputStream in = new DataInputStream(fis);
        BufferedReader br = 
         new BufferedReader(new InputStreamReader(in));
        String strLine;
        while ((strLine = br.readLine()) != null) {
         myData = myData + strLine;
        }
        in.close();
       return String.valueOf(myData);
    }
    
    public void tulisFile(String path, String isi) throws IOException
    {
        FileOutputStream fos = new FileOutputStream(path);
        fos.write(isi.getBytes());
        fos.close();
    }
}
