///////////////////////////////////////////////////////////
//
// Description   :  Ip Packing V2
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  30 May 2021
//
///////////////////////////////////////////////////////////


import java.util.*;

class Ip_Pack_Unpack
{   
    public int Packing(int iNo1, int iNo2, int iNo3, int iNo4)
    {
        return((iNo1 << 24) | (iNo2 << 16) | (iNo3 << 8) | iNo4);
    }
}

class Program211
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        int iNo2 = sobj.nextInt();

        System.out.println("Enter Third Number : ");
        int iNo3 = sobj.nextInt();

        System.out.println("Enter Forth Number : ");
        int iNo4 = sobj.nextInt();

        Ip_Pack_Unpack obj = new Ip_Pack_Unpack();
        int iRet = obj.Packing(iNo1, iNo2, iNo3, iNo4);
        System.out.println("Packed Number is : " + iRet);

    }
}