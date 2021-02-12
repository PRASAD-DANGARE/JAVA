/*

Description      :  Use Of Input Using Non-Buffered In Java 
Function Date    :  12 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/

// in java there are two ways to accept the input by 1) Buffered (Buffered Reader) 2) Non-Buffered (Scanner)

import java.io.*;
import java.util.Scanner;

class Arithmatic
{
    public int no1;
    public int no2; // both are characteristics

    public Arithmatic() // default Constructor
    {
        this.no1 = 0;
        this.no2 = 0;
    }
    public Arithmatic(int x, int y) // Parameterised Constructor
    {
        this.no1 = x;
        this.no2 = y;
    }
    public int Add() 
    {
        int ans = 0;
        ans = this.no1 + this.no2;
        return ans;
    }
} // end of arithmatic

class Demo
{
    public static void main(String arg[])
    {
        Scanner sobj = null;
        sobj = new Scanner(System.in);

        int value1 = 0;
        int value2 = 0;

        System.out.println("Enter First Number");
        value1 = sobj.nextInt();
        System.out.println("Enter Second Number");
        value2 = sobj.nextInt();

        Arithmatic aobj = null;
        aobj = new Arithmatic(value1, value2);

        int iret = 0;
        iret = aobj.Add();
        System.out.println("Addition Is " + iret);
        aobj = null;
    }
}