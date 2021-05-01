/*

Description      :  Switch Statements And Its Use
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
        char color = 'g'; // color set to g (we have to use string inside switch case)

        switch(color)
        {
            case 'r' : System.out.println("Red");
                break;

            case 'g' : System.out.println("Green");
                break;

            case 'b' : System.out.println("Blue");
                break;

            case 'w' : System.out.println("White");
                break;

            default : System.out.println("No Color");
        }
    }
}