///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Count Number Of Words
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  1 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Program229
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = sobj.nextLine();

        String temp = str.trim();
        String arr[] = temp.split("\\s"); // split the words when space is one otherwise count is more
        System.out.println("Number of words are : " + arr.length);
    }
}