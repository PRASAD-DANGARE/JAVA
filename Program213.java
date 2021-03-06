///////////////////////////////////////////////////////////
//
// Description   :  Accept Matrix From User And Display It
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  30 May 2021
//
///////////////////////////////////////////////////////////

import java.util.*;

class Program213
{
    public static void main(String str[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number Of Rows ");
        int row = sobj.nextInt();

        System.out.println("Enter Number Of Columns : ");
        int col = sobj.nextInt();

        int Arr[][] = new int[row][col];

        System.out.println("Enter The Elements : ");
        for(int i = 0; i < Arr.length; i++) // rows
        {
            for(int j = 0; j < Arr.length; j++) // columns
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Enter Elements Are : ");
        for(int i = 0; i < Arr.length; i++) // rows
        {
            for(int j = 0; j < Arr.length; j++) // columns
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }

        Arr = null; // calling gc
    }
}