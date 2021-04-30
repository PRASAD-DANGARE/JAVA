/*

Description      :  Use Of for each Loop To Display Array Elements
Class Name       :  Display
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  30 April 2021

*/

import java.io.*;

class Display
{
    public static void main(String args[])
    {
        int arr[] = {11, 101, -50, 21, 51}; // declare array of 5 elements
        for(int i : arr) // i represents elements of array (elements is stored into i)
        {
            System.out.println(i);
        }
    }
}