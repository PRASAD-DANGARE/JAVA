/*

Description      :  String Is Stored Into String Constant Pool Using Arithmatic Operator
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
        String s1 = "Hello"; // this both s1, s2 is stored into the string constant pool(separate block of memory for string objects by JVM)
        String s2 = "Hello"; // so for both s1, s2 the reference number is same & due to assignment op it get stored into pool.

        if(s1 == s2)
        {
            System.out.println("Both Are Same");
        }
        else
        {
            System.out.println("Both Are Different");
        }
    }
}