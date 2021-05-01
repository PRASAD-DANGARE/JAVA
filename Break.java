/*

Description      :  Break Statement To Goto End Of A Block (goto is not a good programming practice)
Class Name       :  Switch
Function Author  :  Prasad Dangare
Input / Output   :  ----
Function Date    :  01 May 2021

*/

import java.io.*;

class Break
{
    public static void main(String args[])
    {
        boolean x = true;
        block1:
        {            block2:
            {
                block3:
                {
                    System.out.println("Block3"); // control first comes in block 3
                    if(x) break block2; // goto end of bl2

                } // end of bl3

                System.out.println("Block2");
            } // end of bl2

            System.out.println("Block1");

        } // end of bl1
        System.out.println("Out Of All Blocks"); 
    }
}