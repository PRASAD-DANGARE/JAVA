/*

Description      :  Find Factorial Using Forloop 
Function Date    :  16 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/

//program of factorial using for loop

class factorial
{
    public static void main(String args[])
    {
        int sum = 1;
        for(int i = 5; i > 0; i--)
        {
            sum = sum * i;
        }
        System.out.println("Factorial is "+sum);
    }
}