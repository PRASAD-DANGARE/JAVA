/*

Description      :  Addition Of 2 Numbers Using Command Line Arguments
Class Name       :  Arithmatic
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  03 May 2021

*/

import java.io.*;

class Arithmatic
{
    public static void main(String args[])
    {
        if(args.length != 2)
        {
            System.out.println("Please Enter Values ");
            return;
        }

        // take the numbers from args, would be in string form 
        String s1 = args[0];
        String s2 = args[1];

        // convert them into numeric
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);

        double d3 = d1 + d2;
        System.out.println("The Sum is : " + d3);
    }
}