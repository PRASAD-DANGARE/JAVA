///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Find The Number Using Bubble Sort V4
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  5 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;
import Marvellous.MarvellousArrayX;

class BubbleSort extends MarvellousArrayX
{
	public BubbleSort(int iSize)
	{
		super(iSize);
	}

	public void Sort(String type1)
	{
		int i = 0, j = 0, temp = 0;
		boolean Swap = false;
		
		if(type1.equals("Inc"))
		{
			for(i = 0; i < Arr.length; i++)
			{
				Swap = false;
				for(j = 0; (j < Arr.length-i-1); j++)
				{
					if(Arr[j] > Arr[j+1])
					{
						temp = Arr[j];
						Arr[j] = Arr[j+1];
						Arr[j+1] = temp;
						Swap = true;
					}
				}
				if(Swap == false)
				{
					break;
				}
			}
		}
		else if(type1.equals("Dec"))
		{
			for(i = 0; i < Arr.length; i++)
			{
				Swap = false;
				for(j = 0; (j < Arr.length-i-1); j++)
				{
					if(Arr[j] < Arr[j+1])
					{
						temp = Arr[j];
						Arr[j] = Arr[j+1];
						Arr[j+1] = temp;
						Swap = true;
					}
				}
				if(Swap == false)
				{
					break;
				}
			}
		}
		else
		{
			System.out.println("Error : Wrong sorting type");
		}
	}
}

class Program252
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int no = sobj.nextInt();

		BubbleSort obj = new BubbleSort(no);
		//System.out.println("Enter the type of sort you want");
		System.out.println("Inc : For increasing order");
		System.out.println("Dec : For decreasing order");
		//String type1 = sobj.nextLine();
		
		obj.Accept();
		obj.Display();

		obj.Sort("Dec");

		System.out.println("Data after sorting:");
		obj.Display();

	}
}
