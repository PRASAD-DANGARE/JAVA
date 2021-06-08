///////////////////////////////////////////////////////////
//
// Description   :  Importing Matrix Module To Accept Matrix And Display Addition Of Elements From Each Column
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  4 June 2021
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

    void AddColumn()
    {
        int iSum = 0;
		for(int i = 0; i < Arr.length; i++)
		{
			iSum = 0;
			for(int j = 0; j < Arr[i].length; j++)
			{
				iSum = iSum + Arr[j][i];
			}
			System.out.println("Addition Of Column Elements : " + (i+1) + " is : " + iSum);
		}
    }
}

class Assignment51_4
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

        dobj.AddColumn();

		System.gc();
	}
}


