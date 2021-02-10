/*

Description      :  Creating Multiple Classes & Object Creation 
Function Date    :  10 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/


// Application Program To Demonstrate Multiple Classes And Object Creation
// After Compilation 2 Class File Get Created As Demo.class And Hello.class Run Demo.class

import java.lang.*;
import java.io.*;

class Hello
{
    public int no = 10;
    public int value = 20; // both are Characteristics

    public void Fun() // Behaviour
    {
        System.out.println("Inside Fun");
    }

    public void Gun() // Behaviour
    {
        System.out.println("Inside Gun");
    }
} // End Of Hello Class Declaration

class Demo
{
    public static void main(String args[]) // Entry Point 
    {
        System.out.println("Inside Main");
        
        Hello hobj; // Reference of Hello class
        
        hobj = new Hello(); // Object Creation
        
        System.out.println("hobj.no"); // 10 Is Output
        
        hobj.Fun(); // Inside Fun is output

        System.out.println(hobj.hashCode()); // 0x100

        hobj = null;
        //////////////////////////////////////
        Hello gobj; // Reference of Hello class
        
        gobj = new Hello(); // Object Creation
        
        System.out.println("gobj.no"); // 10 Is Output
        
        gobj.Gun(); // Inside Fun is output

        System.out.println(gobj.hashCode()); // 0x100

        gobj = null;
    }
}
