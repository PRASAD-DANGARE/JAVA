/*

Description      :  Demonstartion Of Strcompare On Strings 
Class Name       :  Strcompare
Function Author  :  Prasad Dangare
Input / Output   :  String
Function Date    :  03 May 2021

*/


import java.io.*;

class Strcompare
{
    public static void main(String args[])
    {
        String s1 = "Hello"; // reference number(object reference) of s1 is 1234a
        String s2 = new String("Hello"); // object reference of s2 is 5678b
                 // internally jvm create separate objects on heap and store the string into it and give reference number
        //if(s1 == s2) so we are comparing the reference numbers / string objects not actual strings
        if(s1.equals(s2)) // to compare the contents of string object we can use equals() method
        {
            System.out.println("Both Are Same");
        }
        else
        {
            System.out.println("Both Are Different"); // so we get this output 
        }
    }
}