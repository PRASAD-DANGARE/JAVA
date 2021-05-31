///////////////////////////////////////////////////////////
//
// Description   :  Accept Number From User And Find Generic Root
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  27 May 2021
//
///////////////////////////////////////////////////////////

// 927	->	18	->	9
// 9975	->	30	->	3
// 89457 ->	33	-> 6	
// 8	-> 8
// 23 -> 5

import java.util.*;

class Digits
{
    public int Generic_Root(int iNo) // 927
    {
        int iSum = iNo; // 927

        while(iSum > 9) // 18
        {
            iNo = iSum; // 927 - 18
            iSum = 0;
            while(iNo != 0)
            {
                iSum = iSum + (iNo % 10); // 7, 9, 18 - 8, 9
                iNo = iNo / 10;
            }
        }
        return iSum;
    }
}

class Program199
{
    public static void main(String arg[])
    {
        int no, ret;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        no = sobj.nextInt();

        Digits dobj = new Digits();
        ret = dobj.Generic_Root(no);
        System.out.println("Generic Root is : " + ret);
    }
}

