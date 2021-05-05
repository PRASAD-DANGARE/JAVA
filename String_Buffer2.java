/*

Description      :  Check Whether Given String Is Palindrome Or Not Using String Buffer
Class Name       :  Palindrome
Function Author  :  Prasad Dangare
Input / Output   :  String
Function Date    :  05 May 2021

*/

import java.io.*;

class Palindrome
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter The String : ");
        String str = br.readLine();

        String Temp = str;

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        str = sb.toString();

        if(Temp.equalsIgnoreCase(str))
        {
            System.out.println(Temp + " Is Palindrome");
        }
        else
        {
            System.out.println(Temp + " Is Not a Palindrome");
        }
    }
}