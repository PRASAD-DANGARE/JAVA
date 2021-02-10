/*

Description      :  Getting Input From User To Type A String
Function Date    :  10 Feb 2021
Function Author  :  Prasad Dangare
Input            : String

*/

import java.util.Scanner;

class inputprogram
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Your First Name : ");
        String firstname = input.next();

        System.out.print("Enter Your Last Name : ");
        String lastname = input.next();

        System.out.println("Your Full Name Is "+firstname+" "+lastname);
    }
}