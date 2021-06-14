///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Remove White Spaces V4
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  1 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Program228
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = sobj.nextLine();

        System.out.println("String Length is : " + str.length());
        String temp = str.trim();
        System.out.println("New String is : " + temp);
        System.out.println("Length of new string is : " + temp.length());
        String temp2 = temp.replaceAll("\\s{2,}", ""); // \\s{2,}(regular expression) remove whitespace in pare of 2
        System.out.println("Modified string is : " + temp2);
    }
}