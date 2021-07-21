///////////////////////////////////////////////////////////
//
// Description   :  Accept N Numbers From User And Find The Number Using Bubble Sort V2
// Input         :  Int
// Output        :  Int
// Author        :  Prasad Dangare
// Date          :  5 June 2021
//
///////////////////////////////////////////////////////////

import java.util.*;
import Marvellous.MarvellousArrayX;

class BubbleSort extends MarvellousArrayX
{
	public BubbleSort(int iSize)
	{
		super(iSize);
	}
	
	public void Sort()
	{
        int i = 0, j = 0, temp = 0;

        if(sorted == true)
        {
            return;
        }

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr.length - i - 1; j++)
            {
                if(Arr[j] > Arr[j + 1]) // < for decreasing 
                {
                    temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }

            System.out.println("Data After Pass : " + i);
            for(int k = 0; k < Arr.length; k++)
            {
                System.out.print(Arr[k] + "\t");
            }
            System.out.println();
        }
    }
}

class Program250
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int no = sobj.nextInt();

		BubbleSort obj = new BubbleSort(no);
		obj.Accept();
		obj.Display();

		obj.Sort();
		obj.Display();

	}
}
