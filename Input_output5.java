/*

Description      :  Accept Employee Details & Display It
Class Name       :  Employee
Function Author  :  Prasad Dangare
Input / Output   :  Integer,Char,String
Function Date    :  02 May 2021

*/

import java.io.*;

class Employee
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEnter Employee Details As Below : ");
        System.out.print("Enter Id : ");
        int id = Integer.parseInt(br.readLine());

        System.out.print("Enter Sex (M/F) : ");
        char sex = (char)br.read();
        br.skip(2);

        System.out.print("Enter Name : ");
        String name = br.readLine();

        System.out.println("\nEmployee Details Are : ");

        System.out.println("Id = " + id);
        System.out.println("Sex = " + sex);
        System.out.println("Name = " + name);
    }
}