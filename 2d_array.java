/*

Description      :  Use Of 2D-Array In Java 
Function Date    :  11 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/

import java.lang.*;

class Demo
{
    public static void main(String arg[])
    {
        int arr[][] = new int[4][3];
        int i = 0, j = 0, imult = 0;

        arr[0][0] = 7;
        arr[0][1] = 3;
        arr[1][0] = 2;
        arr[1][1] = 5;
        arr[1][2] = 8;
        arr[2][0] = 6;
        arr[2][1] = 5;
        arr[2][2] = 1;
        arr[3][0] = 7;
        arr[3][1] = 2;
        arr[3][2] = 1;

        for(i = 0; i < arr.length; i++)
        {
            imult = 1;
        
            for(j = 0; j < arr.length; j++)
            {
                imult = imult*arr[i][i];
            }

            System.out.println("Multiplication Is "+imult);
        }
    }
}