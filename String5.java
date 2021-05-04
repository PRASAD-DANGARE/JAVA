/*

Description      :  Accept String From User And Find Whether Given String Is Present Or Not
Class Name       :  Search
Function Author  :  Prasad Dangare
Input / Output   :  String
Function Date    :  03 May 2021

*/

import java.io.*;

class Search
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How Many Strings : ");
        int n = Integer.parseInt(br.readLine());

        String str[] = new String[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter Strings One By One : ");
            str[i] = br.readLine();
        }

        System.out.print("Enter String To Search : ");
        String search = br.readLine();

        boolean found = false;

        for(int i = 0; i < n; i++)
        {
            if(search.equalsIgnoreCase(str[i]))
            {
                System.out.println("Found At Position : " + (i+1));
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("Not Found In The Group");
        }
    }
}