/*

Description      :  Calling Method & Returning The Result From The Method 
Class Name       :  Multiplication
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  01 May 2021

*/

import java.io.*;

class Multiplication
{

    public static void main(String args[]) // main method is the caller 
    {
        // catch the result in Ret, to call static method we can call it using classname.methodname

        int Ret = Multiplication.Multiply(10); // method call with static values
        System.out.println("Result is : " + Ret);
    }

    static int Multiply(int iNo) // Multiply method is the calle which return the value of iNo 
    {
        return iNo * iNo;
    }
}