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

Input : iRow = 3 iCol = 5
Output : A A A A A
		 B B B B B
		 C C C C C

*/

import java.util.*;

class Pattern
{
	public void Pattern(int iRow, int iCol)
	{
		int i = 0, j = 0;
        char ch = 'A';

        System.out.println();
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print("\t" + ch);
            }
            ch++;
            System.out.println();
        }
	}
}

class Assignment50_3
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