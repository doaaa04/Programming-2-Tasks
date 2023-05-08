/**
 *Write a program that carries out the following tasks:
Open a file with the name hello.txt.
Store the message “Hello, World!” in the file.
Close the file.
Open the same file again.
Read the message into a string variable and print it
*/
package com.mycompany.task3;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author D.H.Alshawwa
 */
public class task_E7_1 {
     public static void main(String[] args){
         FileWriter write =null;
         File file=null;
         try {
              file =new File ("hello.txt");
             write = new FileWriter (file);
             String s ="Hello, World!";
             write.write( s);
         } catch (IOException ex) {
            System.out.println("file not exist");
         } finally {
             try {
                 write.close();
             } catch (IOException ex) {
                 System.out.println("file not exist");
             }
         }
         
         if (file.exists()){
             try {
                 Scanner scan =new Scanner (file);
                 while (scan.hasNext()){
                     String s =scan.nextLine();
                     System.out.println(s);
                 }
             } catch (FileNotFoundException ex) {
                System.out.println("file not exist");
             }
         }
     }
}
