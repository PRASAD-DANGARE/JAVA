/*

Description      :  Creating 3-D Array
Class Name       :  Department
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  03 May 2021

*/

import java.io.*;

class Department
{
    public static void main(String args[])
    {
        int dept, student, marks, total = 0;

        // Taking student marks as 3-D Array
        int arr[][][] = {{{50,51,52}, {60,61,62}}, 
                        {{70,71,72}, {80,81,82}}, 
                        {{65,66,67}, {75,76,77}}};

        for(dept = 0; dept < 3; dept++)
        {
            System.out.println("Department " + (dept+1) + ": ");
            for(student = 0; student < 2; student++)
            {
                System.out.print("Student " + (student+1) + " marks : ");
                for(marks = 0; marks < 3; marks++)
                {
                    System.out.print(arr[dept][student][marks] + " ");
                    total += arr[dept][student][marks];
                }
                System.out.println("Total : " + total);
                total = 0; // reset to 0
            }
            System.out.println();
        }
    }
}