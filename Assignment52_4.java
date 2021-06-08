///////////////////////////////////////////////////////////
//
// Description   :  Importing Matrix Module To Accept Matrix And Check Whether The Matrix Is Identity Matrix Or Not
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
	
    boolean ChkIdentity()
    {
        int i = 0, j = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(i == j && Arr[i][j] != 1)
                {
                    return false;
                }
                else if(i != j && Arr[i][j] != 0)
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}

class Assignment52_4
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
		boolean bRet = dobj.ChkIdentity();

        if(bRet == true)
        {
            System.out.println("Its An Identity Matrix ");
        }
        else
        {
            System.out.println("Its Not An Identity Matrix ");
        }

		System.gc();
	}
}


