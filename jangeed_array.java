/*

Description      :  Use Of Jangeed Array In Java 
Function Date    :  11 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/

import java.util.Scanner;

class Demo
{
    public static void main(String arg[])
    {
        int arr[][] = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[2];
        arr[2] = new int[7];

        System.out.println("Please Enter Elements");
        Scanner sobj = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; i < arr[i].length; i++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        int imult = 0;
        for(int i = 0; i < arr.length; i++)
        {
            imult = 1;
            for(int j = 0; j < arr.length; j++)
            {
                imult = imult * arr[i][j];
            }
                
            System.out.println("Multiply Is "+ imult);
        }
    }
}