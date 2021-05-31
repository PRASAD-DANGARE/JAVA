///////////////////////////////////////////////////////////
//
// Description   :  Accept Number From User And Find Wather That Number Is Armstrong Or Not
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  28 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Digits
{
    public boolean Armstrong(int iNo) // 153
    {
        int temp = iNo; // 153
        int Count = 0, iDigit = 0, iSum = 0, iPower = 1;

        while(temp != 0) // 153
        {
            temp = temp / 10;
            Count++; // 3
        }
        temp = iNo; // 153
        while(temp != 0)
        {
            iDigit = temp % 10; 
            //        1      1 <= 3     2,
            //               2 <= 3     3,
            //               3 <= 3     4,
            //               4 <= 3     false.
            for(int i = 1; i <= Count; i++)
            {
                iPower = iPower * iDigit; // 1*1*1 = 1, 5*5*5 = 125, 3*3*3 = 27
            }
            iSum = iSum + iPower; // 0+1 = 1, 1+125 = 126, 126+27 = 153
            iPower = 1; // reset to 1
            temp = temp / 10; // 1, 5, 3
        }
        if(iSum == iNo) // 153 == 153
        {
            return true; // true
        }
        else
        {
            return false;
        }    
    }
}

class Program200
{
    public static void main(String arg[])
    {
        int no;
        boolean bret;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        no = sobj.nextInt();

        Digits dobj = new Digits();
        bret = dobj.Armstrong(no);
        if(bret == true)
        {
            System.out.println("Its An Armstrong Number ");
        }
        else
        {
            System.out.println("Its Not An Armstrong Number ");
        }
    }
}

