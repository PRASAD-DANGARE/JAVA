///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Sort Them
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  5 June 2021
//
///////////////////////////////////////////////////////////

// specific

import java.util.*;

class BubbleSort
{
	public void Sort(int Arr[])
	{
		int i = 0, j = 0, temp = 0;
		
		for(i = 0; i < Arr.length; i++)
		{
			for(j = 0; (j < Arr.length-i-1); j++)
			{
				if(Arr[j] > Arr[j+1])
				{
					temp = Arr[j];
					Arr[j] = Arr[j+1];
					Arr[j+1] = temp;
				}
			}
		}
	}
}

class Program253
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int no = sobj.nextInt();

		int Arr[] = new int[no];

		System.out.println("Enter the elemenets");
		for(int i = 0; i < no; i++)
		{
			Arr[i] = sobj.nextInt();
		}

		System.out.println("Entered elements are");
		for(int i = 0; i < no; i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();

		BubbleSort obj = new BubbleSort();

		obj.Sort(Arr);
		System.out.println("Elements after sorting are");
		for(int i = 0; i < no; i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();
	}
}
