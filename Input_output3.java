/*

Description      :  Accept Number From User Using parseInt 
Class Name       :  Accept
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  01 May 2021

*/

import java.io.*;

class Accept
{
    public static void main(String args[]) throws IOException
    {
        // create BufferedReader Object To Accept Data From Keyword
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ask for integer and read it
        System.out.print("Enter The Number : ");
        int No = Integer.parseInt(br.readLine());

        // display the Integer
        System.out.println("Your Entered : " + No);
    }
}