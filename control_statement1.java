/*

Description      :  Test If A Number Is Positive Or Negative
Class Name       :  Numbers
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  30 April 2021

*/

import java.io.*;

class Numbers
{
    public static void main(String args[]) 
    {
        int Num = -5;

        if(Num == 0)
        {
            System.out.println("Its Is Zero");
        } 
        else if(Num > 0)
        {
            System.out.println(Num + " is positive");
        }  
        else
        {
            System.out.println(Num + " is negative");
        } 
    }
}