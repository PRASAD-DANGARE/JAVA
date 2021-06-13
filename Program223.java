///////////////////////////////////////////////////////////
//
// Description   :  Import Matrix Module To Accept Matrix From User And Display Addition Of Border Elements
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  31 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;
import Marvellous.Matrix;

class Demo extends Matrix
{
	public Demo(int iRow, int iCol)
	{
		super(iRow,iCol);
	}
	int BorderAddition()
	{
		int iSum = 0;

		for(int i = 0; i < Arr.length; i++)
		{
			for(int j = 0; j < Arr[i].length; j++)
			{
				if((i == 0) || (i == Arr.length - 1) || (j == 0) || (j == Arr[i].length - 1))
				{
					iSum = iSum + Arr[i][j];
				}	
			}
		}		
		return iSum;
	}
}
class Program223
{
	public static void main(String str[])	
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();

		Demo dobj = new Demo(row,col);

		dobj.Accept();
		dobj.Display();
		
		int ret = dobj.BorderAddition();
		
		System.out.println("Addition Of All Border Elements is : "+ret);
		System.gc();
	}
}