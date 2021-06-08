///////////////////////////////////////////////////////////
//
// Description   :  Importing Matrix Module To Accept Matrix And Swap The Contents Of Consecutive Rows
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

    void SwapRows()
    {
        int i = 0, j = 0;
        int temp[];

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr.length; j++)
            {
                temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;
            }
        }
        
        System.out.println("Matrix after Interchange Of rows : ");
            
        for(i = 0; i < Arr.length; i++) 
        {
            for(j = 0; j < Arr.length; j++) 
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class Assignment51_5
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

        dobj.SwapRows();

		System.gc();
	}
}


