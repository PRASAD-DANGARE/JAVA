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

Input : iRow = 4 iCol = 4

Output : 1 2 3 4 5
         1 2     5
         1   3   5
         1     4 5
         1 2 3 4 5
		 
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
                if((i == 1) || (j == 1) || (i == iRow) || (j == iCol))
                {
                    System.out.print("\t" + j);
                }
                else if(i == j)
                {
                    System.out.print("\t" + i);
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
	}
}

class Assignment57_5
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