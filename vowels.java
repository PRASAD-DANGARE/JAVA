/*

Description      :  Find Number Of Vowels From User
Function Date    :  10 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Str

*/

// Write a program to Find The Vowels 

import java.util.Scanner;

class Vowel 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input The String : ");
        String str = in.nextLine();

        System.out.print("Number Of Vowels In The String Are : " + count_Vowels(str)+"\n");
    }
    
    public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e'
                || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I'
                || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'I'
                || str.charAt(i) == 'u' || str.charAt(i) == 'U')
            {
                count++;
            }
        }
        return count;
    }
}