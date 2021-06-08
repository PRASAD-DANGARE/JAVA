///////////////////////////////////////////////////////////
//
// Description   :  Importing Matrix Module To Accept Matrix And Reverse The Contents Of Each Column
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

    void ReverseColumn()
    {
        int i = 0, j = 0;
        
        System.out.println("\nNew Matrix After Reversing Each Columns : ");

        System.out.println();
        for(i = Arr.length - 1; i >= 0; i--)
        {
            for(j = 0; j < Arr.length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class Assignment52_3
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

        dobj.ReverseColumn();

		System.gc();
	}
}


