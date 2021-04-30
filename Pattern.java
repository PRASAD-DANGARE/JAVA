/*

Description      :  Display Stars In Right Angled Triangle Form
Class Name       :  Stars
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  29 April 2021

*/

import java.io.*;

class Stars
{
    public static void main(String args[])
    {
        int i = 5; // no of rows
        int j = 0;
        int k = 0;

        for(j = 1; j <= i; j++) // j represent row numbers j : 1,2,3,4,5 time execute 
        {
            for(k = 1; k <= j; k++) // k : no of stars k : 0,1(1), 1,2(2), 1,2,3(3), 1,2,3,4(4), 1,2,3,4,5(5)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

