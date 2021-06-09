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

Input : iRow = 4 iCol = 3

Output : * * *
		 * * *
         * * *
         * * *
		 
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
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
	}
}

class Assignment54_1
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