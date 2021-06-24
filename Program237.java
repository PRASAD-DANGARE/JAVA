///////////////////////////////////////////////////////////
//
// Description   :  Accept String From User And Display It Into Reverse Order
// Input         :  Str
// Output        :  Str
// Author        :  Prasad Dangare
// Date          :  2 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Demo
{
    public String ReverseWord(String str)
    {
        String temp = str.trim().replaceAll("[ ]{2,}"," "); // canonical function left to right calling
        String Arr[] = temp.split(" ");
        
        String output = " ";

        for(int i = 0; i < Arr.length; i++)
        {
            StringBuffer bobj = new StringBuffer(Arr[i]);
            output = output + " " + bobj.reverse();
            bobj = null;
        }
        return output.trim();
    }
}

class Program237
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
        Demo dobj = new Demo();
        String ret = dobj.ReverseWord(str);
        System.out.println(ret);
	}
}
