/*

Description      :  Accept Number From User Using parseFloat
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

        // ask for float and read it
        System.out.print("Enter The Number : ");
        Float No = Float.parseFloat(br.readLine());

        // display the Float
        System.out.println("Your Entered : " + No);
    }
}