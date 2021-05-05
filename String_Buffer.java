/*

Description      :  Use Of String Buffer Class
Class Name       :  String_Buffer_Demo
Function Author  :  Prasad Dangare
Input / Output   :  String
Function Date    :  05 May 2021

*/

import java.io.*;

class String_Buffer_Demo
{
    public static void main(String args[]) throws IOException
    {
        // create empty string buffer object
        StringBuffer sb = new StringBuffer();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // accept data dynamically

        System.out.print("Enter First Name : ");
        String First = br.readLine();

        System.out.print("Enter Middle Name : ");
        String Middle = br.readLine();

        System.out.print("Enter last Name : ");
        String last = br.readLine();

        sb.append(First); // append last to sb
        sb.append(last); // append sur to sb

        System.out.println("Name : " + sb);
        // insert mid after sur name in sb

        int n = First.length(); // n is no of char in firstname
        sb.insert(n,Middle); // insert middlename after nth char

        System.out.println("Full Name Is : " + sb);
        System.out.println("In Reverse Is : " + sb.reverse());
    }
}