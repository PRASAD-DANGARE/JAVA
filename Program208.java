///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Check It Is Anagram Or Not V2
// Input         :  Int, Str
// Output        :  Int, Str
// Author        :  Prasad Dangare
// Date          :  30 May 2021
//
///////////////////////////////////////////////////////////

/*
	"abcde"	"cebad"
	"hello"	"loleh"
	"india"	"iinda"
*/
import java.util.*;

class StringX
{
	boolean CheckAnagram(String str1, String str2) // complixcity is N
	{
		int i = 0;
		int count1[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int count2[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		if(str1.length() != str2.length())
		{
			return false;
		}
		char arr[] = str1.toCharArray();
		char brr[] = str2.toCharArray();

		for(i = 0 ;i < arr.length; i++) // here we travel count1, count2 at same time
		{
			count1[arr[i]-'a']++;		// count1[98 - 97]++	count1[1]++
			count2[brr[i]-'a']++;
		}
		for(i = 0; i < 26;i++)
		{
			if(count1[i] != count2[i])
			{
				break;
			}
		}	
		if(i == 26)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Program208
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter first string");
		String str1 = sobj.nextLine();
		System.out.println("Please enter second string");
		String str2 = sobj.nextLine();
		StringX obj = new StringX();
		boolean bRet = obj.CheckAnagram(str1,str2);
		if(bRet == true)
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");		
	}
}