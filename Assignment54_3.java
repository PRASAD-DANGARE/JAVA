///////////////////////////////////////////////////////////
//
// Description   :  Accept Number Of Rows And Number Of Columns From User And Display Below Pattern.
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  4 June 2021
//
///////////////////////////////////////////////////////////

/*

Input : iRow = 3 iCol = 5
Output : 5 4 3 2 1
		 5 4 3 2 1
		 5 4 3 2 1
		 
*/

import java.util.*;

class Pattern
{
	public void Pattern(int iRow, int iCol)
	{
		int i = 0, j = 0;

        if((iRow < 1) || (iCol < 1))
        {
            System.out.println("Invalid Input ");
            return;
        }

        System.out.println();
        for(i = 0; i <= iRow; i++)
        {
            for(j = iCol; j > 0; j--)
            {
                System.out.print("\t" + j);
            }
            System.out.println();
        }
	}
}

class Assignment54_3
{
	public static void main(String arg[])
	{
		int no1, no2;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter Number Of Rows : ");
		no1 = sobj.nextInt();
		
		System.out.println("Enter Number Of Columns : ");
		no2 = sobj.nextInt();
		
		Pattern pobj = new Pattern();
		pobj.Pattern(no1, no2);
	}
}