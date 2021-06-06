///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Reverse The Contents Of That String And Toggling Them
// Input         :  String
// Output        :  String
// Author        :  Prasad Dangare
// Date          :  3 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class StringDemo
{
    public void StrRevTog(String str)
    {
        int i = 0;
        char arr[] = str.toCharArray();

        for(i = arr.length - 1; i >= 0; i--)
        {
            if((arr[i] >= 'A') && (arr[i] <= 'Z'))
            {
                arr[i] += 32;
            }
            else if((arr[i] >= 'a') && (arr[i] <= 'z'))
            {
                arr[i] -= 32;
            }
            System.out.print(arr[i]);
        }
    }
}
class Assignment49_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The String : ");
        
        String str = sobj.nextLine();
        
        StringDemo obj = new StringDemo();
        obj.StrRevTog(str);
    }
}