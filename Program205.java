///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Convert Into Char And Display It
// Input         :  Int, Str
// Output        :  Int, Str
// Author        :  Prasad Dangare
// Date          :  30 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public void Display(String str)
    {
        char arr[] = str.toCharArray();
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
class Program205
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please Enter String : ");
        
        String str = sobj.nextLine();
        
        StringX obj = new StringX();
        obj.Display(str);
    }
}