/*

Description      :  Accepting Different Inputs In A Line
Class Name       :  Multiple_Input
Function Author  :  Prasad Dangare
Input / Output   :  Integer,String
Function Date    :  02 May 2021

*/


import java.io.*;
import java.util.*;

class Multiple_Input
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ask user for input separated by commas
        System.out.print("Enter Name, Age, Salary In Single Line : ");

        // accept input into a string
        String str = br.readLine();

        // use StringTokenizer to split input at commas
        StringTokenizer st = new StringTokenizer(str, ",");

        // we get have 3 tokens as string
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

        // trim any spaces before & after the token
        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim();

        // convert the tokens according to the input
        String name  = s1;
        int age = Integer.parseInt(s2);
        float sal = Float.parseFloat(s3);

        // display the input
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + sal);

    }
}