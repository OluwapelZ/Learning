/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time.complexity;

import java.io.*;
import java.util.Scanner;""

/**
 *
 * @author oluwapelumi
 */
public class WriteFile {
    
    public static void main(String args[]) throws IOException{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file name you would like to create ---> ");
        String fileLocation = scanner.nextLine();
        
        System.out.println("Enter the content you would like to write ---> ");
        String fileContent = scanner.nextLine();
        
        WriteFile writeFile = new WriteFile();
        writeFile.writeToFileWithFileWriter(fileLocation, fileContent);
        
    }
    
    public void writeToFileWithFileWriter(String fileLocation, String fileContent) throws IOException {
        BufferedWriter bufferedWriter = null;
 
        try{
            PrintWriter printWriter = new PrintWriter(fileLocation);
            
            //Wrap this writer in a bufferedWriter.
            bufferedWriter = new BufferedWriter(printWriter);
            bufferedWriter.write(fileContent);           
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        finally {
            if(bufferedWriter != null)
                bufferedWriter.close();
        }
    }
}
