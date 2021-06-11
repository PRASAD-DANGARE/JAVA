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

Output : H # # # #
		 H e # # #
		 H e l # #
		 H e l l #
		 H e l l o
		 
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
      	    for(int j = 0; j< arr.length; j++)
      	    {
      		    if(j <= i)
      		    {
      			    System.out.print(arr[j] + "\t");
      		    }
      		    else
      		    {
      			    System.out.print("#\t");
      		    }
      	    }
      	    System.out.println();
        }
	}
}

class Assignment56_3
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