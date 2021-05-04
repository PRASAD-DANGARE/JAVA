/*

Description      :  Demonstartion Of Strsplit On Strings 
Class Name       :  Strsplit
Function Author  :  Prasad Dangare
Input / Output   :  String
Function Date    :  03 May 2021

*/


import java.io.*;

class Strsplit
{
    public static void main(String args[])
    {
        String str = "Hello I'm Prasad Dangare";
        String s[];

        s = str.split(" ");

        for(int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }
    }
}