/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time.complexity;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author oluwapelumi
 */
public class ReadFile {
    
    private InputStream inputStream = null;
    private int input;
    private char textCharacters;
    private String fileText;
        
    public static void main(String args[]) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        String fileLocation = scanner.nextLine();
        ReadFile readFile = new ReadFile();
        readFile.readFileWithBufferReader(fileLocation);
    }
    
    public void readFileWithInputStream(String fileLocation) throws IOException{
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
    
    public void readFileWithBufferReader(String fileLocation) throws IOException {
        BufferedReader bufferedReader = null;

        try {            
            System.out.println("==========Characters in file==========");
            
            FileReader fileReader = new FileReader(fileLocation);
            //Wrap filereader in a Bufferedreader...
            
            bufferedReader = new BufferedReader(fileReader);
            
            while((fileText = bufferedReader.readLine()) != null) {
                System.out.println(fileText);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(bufferedReader != null)
                bufferedReader.close();
        }
    }
    
}
