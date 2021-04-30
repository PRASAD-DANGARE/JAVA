/*

Description      :  Display Numbers From 1 To 5 Using 2 Initilizer In for Loop
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
        int y = 5;

        for(x = 1, y = 5; x <= 5; x++, y--)
        {
            System.out.println(x + "\t" + y);
        }
    }
}