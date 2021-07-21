///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Find The Number Using Binary Search V4
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  5 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;
import Marvellous.MarvellousArrayX;

class Searching extends MarvellousArrayX
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

	public boolean BinarySearch(int no)
	{
		int istart, iend, imid;
		istart = 0;
		iend = Arr.length-1;
		imid = (istart + iend) /2;

		if(sorted == false)
			return (SearchBidirectional(no));

		if((no < Arr[istart]) || (no > Arr[iend]))
			return false;

		while(istart <= iend)
		{
			if(Arr[imid] == no)
			{
				break;
			}
			else
			{
				if(no < Arr[imid])
				{
					iend = imid-1;
				}
				else
				{	
					istart = imid+1;
				}
				imid = (istart + iend ) /2;
			}
		}
		if(Arr[imid] == no)
		{		return true;	}
		else
		{		return false;	}
	}
}

class Program247
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int no = sobj.nextInt();

		Searching obj = new Searching(no);
		obj.Accept();
		obj.Display();

		System.out.println("Enter the Elemet to search");
		no = sobj.nextInt();
		boolean bret = obj.BinarySearch(no);
		if(bret == true)
		{
			System.out.println("Elemet is there in array");
		}
		else
		{
			System.out.println("Element is not there in array");
		}
	}
}