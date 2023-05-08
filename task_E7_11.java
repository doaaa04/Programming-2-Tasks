/*
 * Write a program that reads each line in a file, reverses its lines, and writes them to
another file. For example, if the file input.txt contains the lines
Mary had a little lamb
Its fleece was white as snow
And everywhere that Mary went
The lamb was sure to go.
and you run
reverse input.txt output.txt
then output.txt contains
The lamb was sure to go.
And everywhere that Mary went
Its fleece was white as snow
Mary had a little lamb
 */
package com.mycompany.task3;
import java.util.*;
import java.io.*;
/**
 *
 * @author D.H.Alshawwa
 */
public class task_E7_11 {
         public static void main(String[] args) throws FileNotFoundException{
             File file =new File("input.txt");
             Scanner scan =new Scanner (file);
             ArrayList <String>arr=new ArrayList<>();
             while (scan.hasNextLine()){
                 arr.add(0,scan.nextLine());
             }
             
             System.out.println(arr);
         }
    
}
