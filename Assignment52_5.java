///////////////////////////////////////////////////////////
//
// Description   :  Importing Matrix Module To Accept Matrix And Check Whether The Matrix Is Sparse Matrix Or Not
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
	
    boolean ChkSparse()
    {
        int i = 0, j = 0;
        int iCnt = 0, iCntzero = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iCntzero++;
                }
                else
                {
                    iCnt++;
                }
            }
        }
        if(iCntzero > iCnt)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Assignment52_5
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
		boolean bRet = dobj.ChkSparse();

        if(bRet == true)
        {
            System.out.println("Its An Sparse Matrix ");
        }
        else
        {
            System.out.println("Its Not An Sparse Matrix ");
        }

		System.gc();
	}
}
