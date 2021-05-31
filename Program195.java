///////////////////////////////////////////////////////////
//
// Description   :  Accept Number From User And Perform Addition Of That Number V1
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  27 May 2021
//
///////////////////////////////////////////////////////////


import java.util.*;

class Program195
{
	public static void main(String arg[])
	{
		int no1, no2, ans;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter first number");
		no1 = sobj.nextInt();
		
		System.out.println("Enter second number");
		no2 = sobj.nextInt();
		
		ans = no1 + no2;
		
		System.out.println("Addition is : "+ans);
	}
}