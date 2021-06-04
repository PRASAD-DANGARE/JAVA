///////////////////////////////////////////////////////////
//
// Description   :  Accept Matrix From User And Display It Using OOP Techniques
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  30 May 2021
//
///////////////////////////////////////////////////////////


import java.util.*;

class Matrix
{
    public int Arr[][]; // reference

    public Matrix(int iRow, int iCol)
    {
        Arr = new int[iRow][iCol];
    }

    protected void finalize()
    {
        Arr = null;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please Enter The Elements : ");
        
        for(int i = 0; i < Arr.length; i++) // rows
        {
            for(int j = 0; j < Arr.length; j++) // columns
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Elements Of Matrix Are : ");
        
        for(int i = 0; i < Arr.length; i++) // rows
        {
            for(int j = 0; j < Arr.length; j++) // columns
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class Program215
{
    public static void main(String str[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number Of Rows ");
        int row = sobj.nextInt();

        System.out.println("Enter Number Of Columns : ");
        int col = sobj.nextInt();

        Matrix mobj = new Matrix(row, col);
        mobj.Accept();
        mobj.Display();

        System.gc();

    }
}