/*

Description      :  Display Numbers From 1 To 10 Using Dowhile Loop
Class Name       :  Numbers
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  29 April 2021

*/

import java.io.*;

class Numbers
{
    public static void main(String args[])
    {
        int x = 1;
        do
        {
            System.out.println(x);
            x++;
        }
        while(x <= 10);
    }
}