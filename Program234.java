///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Display The Longest Word
// Input         :  Str
// Output        :  Str
// Author        :  Prasad Dangare
// Date          :  2 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Demo
{
	public void MaxWord(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," "); // canonical function left to right calling
		String Arr[] = temp.split(" ");
		String stemp = null;
		int iMax = Arr[0].length();
		
		for(String s : Arr)
		{
			if(s.length() > iMax)
			{
				iMax = s.length();
				stemp = s;
			}
		}
		System.out.println("Longest word is : "+stemp);
	}
}

class Program234
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj = new Demo();
		dobj.MaxWord(str);
	}
}
