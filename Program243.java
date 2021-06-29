///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Check Whether Array Is Sorted Or Not
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  5 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;
import Marvellous.MarvellousArray;

class Searching extends MarvellousArray
{
	public Searching(int iSize)
	{
		super(iSize);
	}

	public boolean SearchLinear(int no)
	{
		int i = 0;
		for(i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == no)
				break;
		}
		if(i == Arr.length)
			return false;
		else
			return true;
	}

	public boolean SearchBidirectional(int no)
	{
		int istart =0;
		int iend = Arr.length-1;

		while(istart <= iend)
		{
			if((Arr[istart] == no) || (Arr[iend] == no))
			{
				break;
			}
			istart++;
			iend--;
		}
		if(istart > iend)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public boolean CheckSorted()	// Increasing order
	{
		int i =0; 
		for(i = 0; i < Arr.length-1; i++)
		{
			if(Arr[i] > Arr[i+1])
				break;
		}
		if(i == Arr.length-1)
			return true;
		else
			return false;
	}
}

class Program243
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int no = sobj.nextInt();

		Searching obj = new Searching(no);
		obj.Accept();
		obj.Display();

		boolean bret = obj.CheckSorted();
		if(bret == true)
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("Array is not sorted");
		}
	}
}