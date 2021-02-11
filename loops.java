/*

Description      :  Use Of Loops In Java 
Function Date    :  11 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/

import java.io.*;

class Demo
{
    public static void main(String arg[])
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println(i); // 0 1 2 3 4
        }

        int no = 0;
        while(no < 5)
        {
            System.out.println(no); // 0 1 2 3 4
            no++;
        }

        int value = 0;
        do
        {
            System.out.println(value); // 0 1 2 3 4
            value++;
        } while(value < 5);
    }
}
