///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Display The Words In Even Position
// Input         :  Str
// Output        :  Str
// Author        :  Prasad Dangare
// Date          :  2 June 2021
//
///////////////////////////////////////////////////////////

// array of any type : use length property : Ex - Arr.length
// for string use length() method : Ex = str.length()

import java.util.*;

class Demo
{
    public void EvenWord(String str)
    {
        String temp = str.trim().replaceAll("[ ]{2,}"," "); // canonical function left to right calling
        String Arr[] = temp.split(" ");
        
        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i].length() % 2) == 0)
            {
                System.out.println(Arr[i]);
            }
        }
    }
}

class Program232
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
