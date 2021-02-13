/*

Description      :  Find Maxnum In Java 
Function Date    :  13 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/

// write a program to check maxnum by entering command line arguments

class Maxnum
{
    public static void main(String args[])
    {
        int i, j, k;
        i = Integer.parseInt(args[0]);
        j = Integer.parseInt(args[1]);
        k = Integer.parseInt(args[2]);

        if(i >= j && i >= k)
        System.out.println("Max num is"+" "+i);
        else if(j >= k && j >= i)
        System.out.println("Max num is"+" "+j);
        else
        System.out.println("Max num is"+" "+k);
    }
}