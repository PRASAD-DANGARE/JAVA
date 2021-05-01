/*

Description      :  Accept Single Char From User Using read 
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

        // ask four char and read it
        System.out.print("Enter One Character : ");
        char ch = (char)br.read();

        // display the character
        System.out.println("Your Entered : " + ch);
    }
}