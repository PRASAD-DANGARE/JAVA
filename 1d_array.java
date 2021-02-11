/*

Description      :  Use Of 1D-Array In Java 
Function Date    :  11 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/

import java.lang.*;

class Demo
{
    public static void main(String arg[])
    {
        int isub = 0; // reference created
        int arr[] = new int[4]; // memory allocated
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;
        arr[3] = 1;

        for(int i = 0; i < arr.length; i++)
        {
            isub = isub + arr[i];
        }

        System.out.println("Addition Is : "+isub);
    }
}
