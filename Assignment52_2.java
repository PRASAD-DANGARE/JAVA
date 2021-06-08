///////////////////////////////////////////////////////////
//
// Description   :  Importing Matrix Module To Accept Matrix And Reverse The Contents Of Each Rrow.
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

    void ReverseRow()
    {
        int i = 0, j = 0;
        
        System.out.println("\nNew Matrix After Reversing Each Rows : ");

        System.out.println();
        for(i = 0; i < Arr.length; i++)
        {
            for(j = Arr.length - 1; j >= 0; j--)
            {import java.util.*;
import Marvellous.Matrix;

class Demo extends Matrix
{
	public Demo(int iRow, int iCol)
	{
		super(iRow,iCol);
	}
	
    void AddDiagonal()
    {
        int iSum = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }
        System.out.println("\nAddition Of Diagonals Are : " + iSum);
    }
}

class Assignment51_1
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
		dobj.AddDiagonal();
		System.gc();
	}
}



                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class Assignment52_2
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

        dobj.ReverseRow();

		System.gc();
	}
}


