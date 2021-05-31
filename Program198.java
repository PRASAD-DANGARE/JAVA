///////////////////////////////////////////////////////////
//
// Description   :  Accept Number From User And Display Below Pattern
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  27 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

/*
1 1 1 1 1
3 _ _ _ 3
5 _ _ _ 5
7 _ _ _ 7
9 9 9 9 9

11	12	13	14	15
21	22	23	24	25
31	32	33	34	35
41	42	43	44	45
51	52	53	54	55

*/

class Pattern
{
	void Display(int iRow, int iCol)
	{
		int no = 1;
		for(int i = 1; i <= iRow; i++)
		{
			for(int j = 1; j <= iCol; j++)
			{
				if((i == 1) || (j == 1) || (i == iRow) || (j == iCol))
				{
					System.out.print(no + "\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			no = no + 2;
			System.out.println();
		}
	}
}

class Program198
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
		pobj.Display(no1, no2);
	}
}