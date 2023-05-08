/*
 * Write a program Find that searches all files specified on the command line and prints
out all lines containing a specified word. For example, if you call
java Find ring report.txt address.txt Homework.java
then the program might print
report.txt: has broken up an international ring of DVD bootleggers that
address.txt: Kris Kringle, North Pole
address.txt: Homer Simpson, Springfield
Homework.java: String filename;
The specified word is always the first command line argument. 
 */
package com.mycompany.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class task_E7_8 {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
        }

        String input = "ring";

        File one = new File("report.txt");
        Scanner in = new Scanner(one);
        while (in.hasNext()) {
            String een = in.next();

            if (een.matches(input)) {
                System.out.println(in.nextLine());
            }
        }

    }

}
