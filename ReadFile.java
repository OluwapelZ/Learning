/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time.complexity;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author oluwapelumi
 */
public class ReadFile {
        
    public static void main(String args[]) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        String fileLocation = scanner.nextLine();
       InputStream inputStream = null;
       int input;
       char textCharacters;
        try {
            inputStream = new FileInputStream(fileLocation);
            
            System.out.println("==========Characters in file==========");
            while((input = inputStream.read()) != -1) {
                textCharacters = (char) input;
                //Prints Character
                System.out.print(textCharacters);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            if(inputStream != null) 
                inputStream.close();
        }
        
    }
    
}
