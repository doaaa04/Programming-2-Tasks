/*
 * E7.2 Write a program that reads a file, removes any blank lines, and writes the non-blank
lines back to the same file
 */
package com.mycompany.task3;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class task_E7_2 {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("infile.txt");
            BufferedReader br = new BufferedReader(fr);

            fw = new FileWriter("outfile.txt");
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.equals("")) {
                    fw.write(line, 0, line.length());
                }
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException ex) {

            }
        }
    }
}
