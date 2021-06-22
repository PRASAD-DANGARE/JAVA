///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Display The Words In Even Position V2
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
        
        for(String s : Arr) // for each loop
        {
            if((s.length() % 2) == 0)
            {
                System.out.println(s);
            }
        }
    }
}

class Program233
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
