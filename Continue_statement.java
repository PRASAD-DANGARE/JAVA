/*

Description      :  Use Of Labeled Continue Statement 
Class Name       :  Label
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  01 May 2021

*/

import java.io.*;

class Label
{
    public static void main(String args[])
    {
        int i = 1, j = 0;

        loop1: while(i <= 3)
        {
            System.out.print(i); // display i values from 1 to 3
            System.out.println("--------------------------");
            loop2: for(j = 1; j <= 5; j++)
            {
                System.out.println("\t" + j);
                if(j == 3) // j values is 3, then use continue to go back
                {
                    i++; // 1,2,3
                    continue loop1; // go back to while loop
                }
            }
        }
    }
}