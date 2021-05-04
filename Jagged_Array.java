/*

Description      :  Use Of Jagged Array
Class Name       :  Jagged
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  03 May 2021

*/

import java.io.*;

class Jagged
{
    public static void main(String args[])
    {
        int x[][] = new int[2][]; // jagged array that contain 2 one-D array

        // create 2 more 1D array of x
        x[0] = new int[2]; // 2 elements in 1 array
        x[1] = new int[3]; // 3 elements in 2 array

        x[0][0] = 10; // store 2 elements into 1 array
        x[0][1] = 11;

        x[1][0] = 12; // store 3 elements into 2 array
        x[1][1] = 13;
        x[1][2] = 14;

        for(int i = 0; i < 2; i++) // display elements of 1 array
        {
            System.out.print(x[0][i] + ", ");
        }
        System.out.print("First Array\n");

        for(int i = 0; i < 3; i++) // display elements of 2 array
        {
            System.out.print(x[1][i] + ", ");
        }
        System.out.print("Second Array\n");
    }
}