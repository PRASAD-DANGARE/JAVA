/*

Description      :  Shorting The Number 
Function Date    :  20 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/


class Number_Sorting
{
    public static void main(String args[])
    {
        int number[] = {50, 45, 70, 81, 30};
        int n = number.length;
        System.out.println("The Length is "+n);

        for (int i = 0; i < n-1; i++) // Sorting Logic
        {
            for (int j = i + 1; j < n; j++)
            {
                if (number[i] > number[j])
                {
                    int temp = number[j];
                    number[j] = number[i];
                    number[i] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++)
        System.out.println(number[i] + " ");
    }
}