/*

Description      :  Accept Input From User And Perform Arithmatic Operations
Class Name       :  Arithmatic_Operations
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  02 May 2021

*/

import java.io.*;
import java.util.*;

class Arithmatic_Operations
{
    public static void main(String args[]) throws IOException
    {
        // to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // take input into str from keyboard
        System.out.print("Enter Two Numbers Separated By Comma : ");

        // accept input into a string
        String str = br.readLine();

        // split the string at commas
        StringTokenizer st = new StringTokenizer(str, ",");

        // take 2 tokens into s1, s2
        String s1 = st.nextToken();
        String s2 = st.nextToken();

        // trim the spaces in s1, s2
        s1 = s1.trim();
        s2 = s2.trim();

        // convert s1, s2 into double and store in n1, n2
        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);

        // perform Arithmatic Operations

        System.out.println("Addition Is : " + (n1 + n2));
        System.out.println("Subtraction Is : " + (n1 - n2));
        System.out.println("Multiplication Is : " + (n1 * n2));
        System.out.println("Division Is : " + (n1 / n2));
    }
}