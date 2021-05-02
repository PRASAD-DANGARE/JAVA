/*

Description      :  Creating 1-D Array Dynamically
Class Name       :  Bubble_Sort
Function Author  :  Prasad Dangare
Input / Output   :  Integer
Function Date    :  02 May 2021

*/

import java.io.*;

class Bubble_Sort
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter How Many Elements : ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter Elements : ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        // use bubble short tehnique to sort the integer
        int limit = n - 1; // elements from 0 to n-1
        boolean flag = false; // if it is true, swapping is done
        int temp;

        for(int i = 0; i < limit; i++)
        {
            for(int j = 0; j < limit; j++)
            {
                // if first element is greater than second one, then swap
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; // swapping is done
                }
            }
            if(flag == false) break; // no swapping, come out
            else flag = false; // assign initial value
        }
        System.out.println("The Shorted Array Elements Are : ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}