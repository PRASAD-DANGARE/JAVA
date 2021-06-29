///////////////////////////////////////////////////////////
//
// Description   :  Creating MarvellousArray Package
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  5 June 2021
//
///////////////////////////////////////////////////////////

package Marvellous;

import java.util.*;

public class MarvellousArray
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