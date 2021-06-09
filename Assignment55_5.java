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

Output : H
         H e
         H e l
         H e l l
         H e l l o
         H e l l
         H e l
         H e l
         H e
         H
		 
*/

import java.util.*;

class Pattern
{
	public void Pattern(String str)
	{
		char arr[] = str.toCharArray();

        System.out.println();
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("\t" + arr[j]);
            }
            System.out.println();
        }

        //System.out.println();
        for(int i = arr.length - 1; i >= 0; i--)
        {
            for(int j = 0; j <= i - 1; j++)
            {
                System.out.print("\t" + arr[j]);
            }
            System.out.println();
        }
	}
}

class Assignment55_5
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
