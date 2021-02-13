/*

Description      :  Use Of Do-While Loop In Java 
Function Date    :  13 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/

class Dowhile1
{
    public static void main(String args[])
    {
        int i = 10;
        do
        {
            System.out.println("Tick"+" "+i);
            i--;
        }
        while(i > 0);
    }
}