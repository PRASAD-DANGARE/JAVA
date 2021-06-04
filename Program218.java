///////////////////////////////////////////////////////////
//
// Description   :  Import Matrix Module To Accept Matrix From User And Display Addition Of Them
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  30 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;
import Marvellous.Matrix;

class Demo extends Matrix // inherit the matrix class
{
    public Demo(int iRow, int iCol)
    {
        super(iRow, iCol); 
    }
    public int Addition()
    {
        int iSum = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr.length; j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }
}

class Program218
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

        int iRet = dobj.Addition();
        System.out.println("Addition is : " + iRet);

		System.gc();
	}
}
