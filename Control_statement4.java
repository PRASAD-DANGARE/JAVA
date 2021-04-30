/*

Description      :  Display Numbers From 1 To 6 Using for Loop
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
        int x = 0;

        for(x = 1; x <= 6; x++) // 1) for(; x <= 10; x++), 2) for(; x <= 10; )
        {
            System.out.println(x);
            //2 x++;
        }
    }
}