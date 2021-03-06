///////////////////////////////////////////////////////////
//
// Description   :  Import Matrix Module To Accept Matrix From User And Display Maximum & Minimum Number
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
        super(iRow, iCol); 
    }
    public int Maximum()
    {
        int iMax = Arr[0][0];
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;
    }

    public int Minimum()
    {
        int iMin = Arr[0][0];
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] < iMin)
                {
                    iMin = Arr[i][j];
                }
            }
        }
        return iMin;
    }
}

class Program220
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

        int iRet = dobj.Maximum();
        System.out.println("Maximum Number is : " + iRet);

        int iRet2 = dobj.Minimum();
        System.out.println("Minimum Number is : " + iRet2);

		System.gc();
	}
}
