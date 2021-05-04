/*

Description      :  Use Of Command Line Arguments
Class Name       :  CLA
Function Author  :  Prasad Dangare
Input / Output   :  String
Function Date    :  03 May 2021

*/

import java.io.*;

class CLA
{
    public static void main(String args[])
    {
        int n = args.length;
        System.out.println("No Of Arguments : " + n);

        System.out.println("The Arguments are : ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(args[i]);
        }
    }
}