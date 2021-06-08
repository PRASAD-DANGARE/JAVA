///////////////////////////////////////////////////////////
//
// Description   :  Importing Matrix Module To Accept Matrix From User And Display Transpose Of The Matrix
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

    void Transpose()
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
        
        System.out.println("Matrix after Interchange Of rows And Columns : ");
            
        for(j = 0; j < Arr.length; j++) 
        {
            for(i = 0; i < Arr.length; i++) 
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class Assignment52_1
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

        dobj.Transpose();

		System.gc();
	}
}


