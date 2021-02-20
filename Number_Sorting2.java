/*

Description      :  Shorting The Number Using Command Line Arguments
Function Date    :  20 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/

class Number_Sorting2
{
    public static void main(String args[])
    {
        int n[] = new int[5];
        for (int i = 0; i < args.length; i++)
        {
            n[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < args.length; i++)
        {
            for (int j = i + 1; j < args.length; j++)
            {
                if(n[i] > n[j])
                {
                    int temp = n[j];
                    n[j] = n[i];
                    n[i] = temp;
                }
            }
        }
        
        for (int i = 0; i < args.length; i++)
        System.out.println(n[i] + " ");
    }
}