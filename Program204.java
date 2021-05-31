///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Display It
// Input         :  Int, Str
// Output        :  Int, Str
// Author        :  Prasad Dangare
// Date          :  28 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Program204
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please Enter String : ");
        
        String str = sobj.nextLine();
        
        System.out.println("Entered String is : " + str);
    }
}