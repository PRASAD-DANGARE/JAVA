/*

Description      :  Creating 2-D Array Dynamically
Class Name       :  Transpose
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  02 May 2021

*/

import java.io.*;
import java.util.Scanner;

class Transpose
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows, Columns : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        // create an array with size [row][col]
        int arr[][] = new int[row][col];

        // accept a matrix from keyboard
        System.out.println("Enter Elements of Matrix : ");

        for(int i = 0; i < row; i++)
        for(int j = 0; j < col; j++)
        arr[i][j] = sc.nextInt();

        System.out.println("The Transpose Matrix : ");

        //take columns as rows and vice versa and display
        for(int i = 0; i < col; i++)
        {
            for(int j = 0; j < row; j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.print("\n");
        }
    }
}