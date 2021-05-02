/*

Description      :  Accept Input From User And Display Fibonacci Series
Class Name       :  Fibonacci
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  02 May 2021

*/

import java.io.*;

class Fibonacci
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How Many Fibonacci : ");
        int No = Integer.parseInt(br.readLine());

        long f1 = 0, f2 = 1; // taking first 2 fabonacci as 0 and 1
        System.out.println(f1);
        System.out.println(f2);

        long f = f1 + f2; // after firsr fibonacci it give result as 1(0+1 = 1)
        System.out.println(f2);
        
        int Count = 3; // 0,1,1 so 3 fibonacci are displayed so count start from 3 till No
        while(Count < No)
        {
            f1 = f2;
            f2 = f;
            f = f1 + f2;
            System.out.println(f);
            Count++;
        }
    }
}