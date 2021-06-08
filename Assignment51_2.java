///////////////////////////////////////////////////////////
//
// Description   :  Importing Matrix Module To Accept Matrix And One Number From User And Return Frequency Of That Number
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
	
    int Count(int iNo)
    {
        int iCnt = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCnt++;
                }
            }
        }
        return iCnt;
    }
}

class Assignment51_2
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

        System.out.println("Enter The Number To Count Frequency : ");
        int iNo = sobj.nextInt();

        int iRet = dobj.Count(iNo);
        System.out.println("Count Of Given Number is : " + iRet);

		System.gc();
	}
}


