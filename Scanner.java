/*

Description      :  Read Different Types Od Data Using Scanner Class
Class Name       :  Scanner_Demo
Function Author  :  Prasad Dangare
Input / Output   :  Integer,String
Function Date    :  02 May 2021

*/

import java.util.Scanner; // Scanner is use to scan the input from keyboard 

class Scanner_Demo
{
    public static void main(String args[]) 
    {
        System.out.println("Enter Id Name Salary One By One : ");
        Scanner sc = new Scanner(System.in);

        int id  = sc.nextInt();
        String name = sc.next();
        float sal = sc.nextFloat();

        System.out.println("\nDetails Are : ");

        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + sal);
    }
}