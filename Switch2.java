/*

Description      :  Switch Supporting String Type
Class Name       :  Switch
Function Author  :  Prasad Dangare
Input / Output   :  String
Function Date    :  01 May 2021

*/

import java.io.*;

class Switch
{
    public static void main(String args[])
    {
        String day = "Tue";

        switch(day)
        {
            case "Sun" : System.out.println("Sunday"); break;

            case "Mon" : System.out.println("Monday"); break;

            case "Tue" : System.out.println("Tuesday"); break;

            case "Wed" : System.out.println("Wednesday"); break;

            case "Thu" : System.out.println("Thursday"); break;

            case "Fri" : System.out.println("Friday"); break;

            case "Sat" : System.out.println("Saturday"); break;

            default : System.out.println("Wrong Day");
        }
    }
}