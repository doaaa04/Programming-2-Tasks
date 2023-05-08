/**
 * E7.10 Write a program that replaces each line of a file with its reverse. For example, if you
run
java Reverse HelloPrinter.java
then the contents of HelloPrinter.java are changed to
retnirPolleH ssalc cilbup
{
)sgra ][gnirtS(niam diov citats cilbup
* {
wodniw elosnoc eht ni gniteerg a yalpsiD //
;)"!dlroW ,olleH"(nltnirp.tuo.metsyS
}
}
Of course, if you run Reverse twice on the same file, you get back the original file. 
 */
package com.mycompany.task3;

import java.util.*;
import java.io.*;

/**
 *
 * @author D.H.Alshawwwa
 */
public class Reverse {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner Input = new Scanner(new File("text_input.txt"));
        ArrayList<String> Lines = new ArrayList<String>();
        while (Input.hasNextLine()) {
            Lines.add(Input.nextLine());
        }
        Input.close();
        PrintWriter Output = new PrintWriter(new File("text_Output"));
        for (int i = 0; i < Lines.size(); i++) {
            char[] strLine = Lines.get(i).toString().toCharArray();
            for (int j = strLine.length - 1; j >= 0; j--) {
                Output.print(strLine[j]);
                Output.println();
            }
            Input.close();
            Output.close();
        }
    }
}
