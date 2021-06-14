///////////////////////////////////////////////////////////
//
// Description   :  Import Matrix Module To Accept Matrix From User And Find The Forest Number
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  1 June 2021
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
	void Forest()
	{
		for(int i = 1; i< Arr.length-1; i++)
		{
			for(int j = 1; j < Arr[i].length-1; j++)
			{
				//if((i != 0) || (i != Arr.length-1) || (j != 0) || (j != Arr[i].length-1))
				//{
					if(Arr[i][j] == Arr[i-1][j-1]+Arr[i-1][j]+Arr[i-1][j+1]+Arr[i][j+1]+Arr[i+1][j+1]+Arr[i+1][j]+Arr[i+1][j-1]+Arr[i][j-1])
					{
						System.out.println("Forest element is : "+Arr[i][j]);
					}	
				//}
			}
		}
	}
}
class Program224
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
		dobj.Forest();
		System.gc();
	}
}


/*

    0   1   2   3   4   5      Columns

0   5   6   8   3   4   2      Rows

1   8   6   7   2   1   2

2   1   29  2   3   1   0

3   1   2   2   7   25  3

4   3   0   1   4   2   5

Arr[3][4]       3         +     1       +    0          +    3        +    5          +     2       +     4         +    7   =  25
    i  j
Arr[3][4] = Arr[2][3]     + Arr[2][4]   + Arr[2][5]     + Arr[3][5]   + Arr[4][5]     + Arr[4][4]   + Arr[4][3]     + Arr[3][3]
              3-1   4-1
Arr[i][j] = Arr[i-1][j-1] + Arr[i-1][j] + Arr[i-1][j+1] + Arr[i][j+1] + Arr[i+1][j+1] + Arr[i+1][j] + Arr[i+1][j-1] + Arr[i][j-1];

Arr[2][1]	8+6+7+1+1+2+2+2 = 29

*/
