///////////////////////////////////////////////////////////
//
// Description   :  Creating MarvellousArrayX Package
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  5 June 2021
//
///////////////////////////////////////////////////////////

package Marvellous;

import java.util.*;

public class MarvellousArrayX
{
	public int Arr[];
	public boolean sorted;

	public MarvellousArrayX(int iSize)
	{
		Arr = new int[iSize];
		sorted = true;
	}
	public void Accept()	// 11	21	5	101
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter the elements");
		Arr[0] = sobj.nextInt();

		for(int i = 1; i < Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
			if(Arr[i-1] > Arr[i])
			{
				sorted = false;
			}
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