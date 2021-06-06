///////////////////////////////////////////////////////////
//
// Description   :  Accept 2 Strings From User And Concat Second String After First String
// Input         :  String
// Output        :  String
// Author        :  Prasad Dangare
// Date          :  3 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class StringDemo
{
    public void StrNCatX(String src, String dest)
    {
        String S1 = src;
        String S2 = dest;

        String S3 = S1.concat(S2);

        System.out.println(S3);
    
    }
}

class Assignment49_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First String : ");
        String schar1 = sobj.nextLine();

        System.out.println("Enter Second String : ");
        String schar2 = sobj.nextLine();

        //System.out.println("Enter The Number To Append : ");
        //int iNo = sobj.nextInt();

        StringDemo dobj = new StringDemo();
        dobj.StrNCatX(schar1, schar2);
    }
}

/*import java.util.*;

class StringDemo
{
	public String StrNCatX(String src, String des, int iCnt)
    {
        src.trim().replaceAll("[ ]{2,}"," ");
        String Arr[] = src.split(" ");
        String output = " ";
        String bobj = " ";
      
        if(iCnt > des.length())
        {
       	    System.out.println("your Entered Length is more then the String length");
       	    System.exit(0);
        }

        if(Arr.length - 1 > 1)
        {
       	    if(Arr[2].length() > des.length())
            {
                output = src + " " + des;
                return output;
            }
        }
       
       	for(int i = 0; i < iCnt; i++)
       	{
       	  	bobj = bobj + des.charAt(i);
       	}
       	output = src + bobj;
       
        return output;
       
	}
} 

class Assignment49_1
{
	public static void main(String[] args) 
	{
		Scanner Sobj = new Scanner(System.in);
		
        System.out.println("Enter the First String");
		String s1 = Sobj.nextLine();
		
        System.out.println("Enter the Second String");
		String s2 = Sobj.nextLine();
		
        System.out.println("Enter the number");
		int iNum = Sobj.nextInt();

		StringDemo obj = new StringDemo();

		String ret = obj.StrNCatX(s1, s2, iNum);
		System.out.println("After concation " + ret);
		
	}
}
*/

