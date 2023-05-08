/****
Write a program that reads a file containing two columns of floating-point numbers.
Prompt the user for the file name. Print the average of each column.
*/

package com.mycompany.task3;

import java.util.*;
import java.io.*;

/**
 *
 * @author D.H.Alshawwa
 */
public class Task3 {

    public static void main(String[] args) {
        String path;
        try {
                  Scanner scan =new Scanner(System.in);
            System.out.print("Enter the file name: ");
            path = scan.nextLine(); 
          FileWriter write = new FileWriter(path);
          double first = 0.0;
double second= 0.0;
int lines = 0;
while (scan.hasNext()) {
if (scan.hasNextLine()) {
    String line = scan.nextLine();
    String[] numbers = line.split("\\s+"); // note: split on white spaces
    first += Double.parseDouble(numbers[0]);
    second += Double.parseDouble(numbers[1]);
    lines++;
}
if (lines > 0) {
    System.out.println(first / lines);
    System.out.println(second / lines);
}
}
    }  
        catch (IOException ex) {
            System.out.println("check whether the file is exist or not");
        }
}
    } 
