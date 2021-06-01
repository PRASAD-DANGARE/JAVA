///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Display It In Reverse Order
// Input         :  Int, Str
// Output        :  Int, Str
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Reverse
{
    public void Display_Reverse(String str)
    {
        int i = 0;
        char arr[] = str.toCharArray();
        int j = arr.length;

        for(i = j - 1; i >= 0; i--)
        {
            System.out.print(arr[i]);
        }
    }
}
class Assignment43_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The String : ");
        
        String str = sobj.nextLine();
        
        Reverse obj = new Reverse();
        obj.Display_Reverse(str);
    }
}