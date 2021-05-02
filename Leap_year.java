/*

Description      :  Accept Year From User And Find Leap Year
Class Name       :  Leap
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  02 May 2021

*/

import java.io.*;

class Leap
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter The Year : ");

        int year = Integer.parseInt(br.readLine());

        if(year % 100 == 0 && year % 400 == 0)
        {
            System.out.println("It Is Leap Year");
        }
        else if(year % 100 != 0 && year % 4 == 0)
        {
            System.out.println("It Is Leap Year");
        }
        else
        {
            System.out.println("It's Not A Leap Year");
        }
    }
}