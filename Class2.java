/*

Description      :  Create 2 Classes And call main() Method Of CLASS1 From CLASS2 And Pass The Array
Class Name       :  CLASS2
Function Author  :  Prasad Dangare
Input / Output   :  String
Function Date    :  03 May 2021

*/


import java.io.*;

class CLASS1
{
    public static void main(String args[])
    {
        for(String s: args) // for each loop
        System.out.println(s);
    }
}

class CLASS2
{
    public static void main(String args[])
    {
        String name[] = {"Prasad", "Shiva", "Hrutik", "Shubham"};
        CLASS1.main(name); // call main() of CLASS1 and pass the name array
    }
}