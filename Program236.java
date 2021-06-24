///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Display The Longest Word v3
// Input         :  Str
// Output        :  Str
// Author        :  Prasad Dangare
// Date          :  2 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Demo
{
    public void EvenWord(String str)
    {
        String temp = str.trim().replaceAll("[ ]{2,}"," "); // canonical function left to right calling
        String Arr[] = temp.split(" ");
        
        for(int i = 0; i < Arr.length; i++)
        {
            StringBuffer bobj = new StringBuffer(Arr[i]);
            System.out.println(bobj.reverse());
            bobj = null;
        }
    }
}

class Program236
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
        Demo dobj = new Demo();
        dobj.EvenWord(str);
	}
}
