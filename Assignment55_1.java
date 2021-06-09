///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Display Below Pattern
// Input         :  String
// Output        :  String
// Author        :  Prasad Dangare
// Date          :  4 June 2021
//
///////////////////////////////////////////////////////////

/*

Input : Hello

Output : H e l l o
         H e l l o
         H e l l o
         H e l l o
		 
*/

import java.util.*;

class Pattern
{
	public void Pattern(String str)
	{
		char arr[] = str.toCharArray();
        //int i = 0, j = 0;

        System.out.println();
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                System.out.print("\t" + arr[j]);
            }
            System.out.println();
        }
	}
}

class Assignment55_1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String schar = sobj.nextLine();

        Pattern pobj = new Pattern();
        pobj.Pattern(schar);
	}
}