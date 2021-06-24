///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Display The Number Of Elements
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  2 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class MarvellousArray
{
	public int Arr[];

	public MarvellousArray(int iSize)
	{
		Arr = new int[iSize];
	}
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter the elements");
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
	}
	public void Display()
	{
		System.out.println("Elements from array are : ");
		for(int i = 0; i < Arr.length; i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();
	}
}

class Program240
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int no = sobj.nextInt();

		MarvellousArray mobj = new MarvellousArray(no);
		mobj.Accept();
		mobj.Display();
	}
}