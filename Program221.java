///////////////////////////////////////////////////////////
//
// Description   :  Import Matrix Module To Accept Matrix From User And Display Maximum Number From Each Row
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
    public void Maximum_Row()
    {
        int iMax = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            iMax = Arr[i][0];
            for(int j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }
            System.out.println("Maximum Number In Row No : " + (i + 1) + " is : " + iMax);
        }
    }
}

class Program221
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

        dobj.Maximum_Row();

		System.gc();
	}
}
