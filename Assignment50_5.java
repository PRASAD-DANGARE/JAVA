///////////////////////////////////////////////////////////
//
// Description   :  Accept Row And Column Which Display Bellow Pattern
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  3 June 2021
//
///////////////////////////////////////////////////////////

/*

Input : iRow = 3 iCol = 4
Output : 1 2 3 4
	 	 5 6 7 8
		 9 10 11 12

*/

import java.util.*;

class Pattern
{
	public void Pattern(int iRow, int iCol)
	{
		int i = 0, j = 0, k = 1;
        
        System.out.println();
        for(i = 1; iRow >= i; i++)
        {
            for(j = 1; iCol >= j; j++, k++)
            {
                System.out.print("\t" + k);
            }
            System.out.println();
        }
	}
}

class Assignment50_5
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