/*

Description      :  Demonstartion Of getChar On Strings 
Class Name       :  Strcpy
Function Author  :  Prasad Dangare
Input / Output   :  String
Function Date    :  03 May 2021

*/

import java.io.*;

class Strcpy
{
    public static void main(String args[])
    {
        String str = "Hello Im Prasad Dangare And Im Working As An Software Developer";
        char arr[] = new char[20];

        str.getChars(6,24,arr,0); // start from 6 to 23 not 24 into the array arr with the index start from 0

        System.out.println(arr);
    }
}