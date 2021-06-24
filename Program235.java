///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Display The Longest Word v2
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
        
        int iMax = Arr[0].length();
        int index = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].length() > iMax)
            {
                iMax = Arr[i].length();
                index = i;
            }
        }
        System.out.println("Longest Word Is : " + Arr[index]);
    }
}

class Program235
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
