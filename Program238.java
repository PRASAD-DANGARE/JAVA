///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Find The Frequency Of Characters
// Input         :  Str
// Output        :  Str
// Author        :  Prasad Dangare
// Date          :  2 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Demo
{
	public void CharacterFrequency(String str)
	{
		char Arr[] = str.toCharArray();
		int Frequency = 0;

		HashMap <Character,Integer> hobj = new HashMap<Character,Integer>();
		for(char ch : Arr)
		{
			if(hobj.containsKey(ch))
			{
                Frequency = hobj.get(ch);
				//hobj.put(ch,hobj.get(ch)+1);
			}
			else
			{
				hobj.put(ch,1);
			}
		}
		System.out.println(hobj);
	}
}

class Program238
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj = new Demo();
		dobj.CharacterFrequency(str);
	}
}
