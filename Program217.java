///////////////////////////////////////////////////////////
//
// Description   :  Importing Matrix Module To Accept Matrix From User And Display It 
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  30 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;
import Marvellous.Matrix;

class Program217
{
	public static void main(String str[])	
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();

		Matrix mobj = new Matrix(row,col);
		mobj.Accept();
		mobj.Display();

		System.gc();
	}
}
