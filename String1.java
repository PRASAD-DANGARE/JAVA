/*

Description      :  Creating Array Of Characters (String) 
Class Name       :  String1
Function Author  :  Prasad Dangare
Input / Output   :  String
Function Date    :  03 May 2021

*/

import java.io.*;

class String1
{
    public static void main(String args[])
    {
        // create 3 strings
        String s1 = "Hello I'm ";
        String s2 = new String("Prasad Dangare");
        char arr[] = {'S','o','f','t','w','a','r',' ','D','e','v','e','l','o','p','e','r'};
        String s3 = new String(arr);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Length of s1 = " + s1.length()); // find length of string including spaces

        System.out.println("s1 And s2 Joined = " + s1.concat(s2)); // concatenate two strings

        System.out.println(s1 + " Working As An " + s3); //  concatenate three strings with +

        boolean x = s1.startsWith("a"); // check if string is start with a or not
        if(x) System.out.println("s1 starts with \'a\'");
        else System.out.println("s1 does not start with \'a\'");

        String p = s2.substring(0,7); // get string character from 0 to 7
        String q = s3.substring(0,17); // get string character from 0 to 17

        System.out.println(p+q); // concatenate the string characters with +

        System.out.println("Upper s1 = " + s1.toUpperCase()); // convert into upper case
        System.out.println("lower s1 = " + s1.toLowerCase()); // convert into lower case
    }
}