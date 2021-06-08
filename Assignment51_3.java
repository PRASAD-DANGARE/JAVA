///////////////////////////////////////////////////////////
//
// Description   :  Importing Matrix Module To Accept Matrix And Return Largest Number From Both The Diagonals
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
    int iR = 0;
    int iC = 0;

	public Demo(int iRow, int iCol)
	{
		super(iRow,iCol);
        iR = iRow;
        iC = iCol;
	}

    int Maximum1()
    {
        int iMax = Arr[0][0];

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr.length; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    if(Arr[i][j] > iMax)
                    {
                        iMax = Arr[i][j];
                    }
                }
            }
        }
        return iMax;
    }

    int Maximum2()
    {
        iC = iC - 1;
        int iMax = Arr[0][0];

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr.length; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    if(Arr[i] [iC - i] > iMax)
      		        {
      			        iMax = Arr[i] [iC - i];
      		        }   
                }
            }
        }
        return iMax;
    }
}

class Assignment51_3
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

        int iRet = dobj.Maximum1();
        System.out.println("Maximum Number From Primary Diagonal is : " + iRet);

        int iRet2 = dobj.Maximum2();
        System.out.println("Maximum Number From Secondary Diagonal is : " + iRet2);

		System.gc();
	}
}
