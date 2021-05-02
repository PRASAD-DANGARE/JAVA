/*

Description      :  Creating 1-D Array Dynamically
Class Name       :  Student
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  02 May 2021

*/

import java.io.*;

class Student
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How Many Subjects : ");
        int n = Integer.parseInt(br.readLine());

        // create 1-D Array with size n
        int[] marks = new int[n];

        //store elements into the array
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter Marks : ");
            marks[i] = Integer.parseInt(br.readLine());
        }

        // find total marks
        int total = 0;
        for(int i = 0; i < n; i++)
        {
            total += marks[i];
        }

        // display total marks
        System.out.println("\nTotal Marks = " + total);

        // find percentage
        float percent = (float) total / n;
        System.out.println("\nPercentage is : " + percent);
    }
}