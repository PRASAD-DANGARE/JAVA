///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Count Number Of Words
// Input         :  Str
// Output        :  Str
// Author        :  Prasad Dangare
// Date          :  2 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Demo
{
    public int WordCount(String str)
    {
        String temp = str.trim().replaceAll("[ ]{2,}"," "); // canonical function left to right calling
        String Arr[] = temp.split(" ");
        return Arr.length;
    }
}

class Program231
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
        Demo dobj = new Demo();
        int iRet = dobj.WordCount(str);
        System.out.println("Number of words are : " + iRet);
	}
}
