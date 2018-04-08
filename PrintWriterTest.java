/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time.complexity;

import java.io.*;

/**
 *
 * @author oluwapelumi
 */
public class PrintWriterTest {
    
    public static void main(String args[]) throws IOException {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("newFile", "UTF-8"); 
            printWriter.write("Okay so let's see if this works");
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        finally {
            if(printWriter != null)
                printWriter.close();
        }
        
    }
    
}
