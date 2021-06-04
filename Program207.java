///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Check It Is Anagram Or Not V1
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
	boolean CheckAnagram(String str1, String str2) // complexcity is 2N
	{
		int i = 0;
		int count1[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; // create array of 26 elements
		int count2[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		if(str1.length() != str2.length()) // filter
		{
			return false;
		}

		char arr[] = str1.toCharArray(); // convert into character array
		char brr[] = str2.toCharArray();

		for(i = 0; i < arr.length; i++)
		{
			count1[arr[i]-'a']++; // count1[98(b) - 97(a)]++ = count1[1]++ or count1[arr['a']-'a'] = [0] asel tar index ha ++ kar count1[0]++  
		}   // its like hashtable
		for(i = 0; i < brr.length; i++)
		{
			count2[brr[i]-'a']++; // count1, ani count2 madhe apan character count kale
		}
		for(i = 0; i < 26; i++) 
		{
			if(count1[i] != count2[i]) // jar dogancha cha count ha same nasel tar break 
			{
				break;
			}
		}	
		if(i == 26) // jar loop ha without break asel tar i he 26 parant janar or we check that i goes till 26 or not
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Program207
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