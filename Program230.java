///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Remove Extra White Spaces
// Input         :  Str
// Output        :  Str
// Author        :  Prasad Dangare
// Date          :  2 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Program230
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter string");
		String str = sobj.nextLine();
		
		System.out.println("String length is : "+str.length());
		String temp = str.trim().replaceAll("[ ]{2,}"," "); // replace 2 whitespaces with 1 whitespaces
		
		System.out.println("New string length after removing extra white spaces : "+temp.length());
		System.out.println("Modified string is : "+temp);
	}
}
