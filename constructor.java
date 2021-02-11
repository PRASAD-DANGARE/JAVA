/*

Description      :  Use Of Constructor In Java 
Function Date    :  11 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/


// Application Program To Demonstrate Constructor And Distructor

import java.lang.*;
import java.io.*;

class Hello // Default Constructor
{
    public int i;
    public int j;
    
    public Hello()
    {
        this.i = 0;
        this.j = 0; // both are characters
    }

    public Hello(int x, int y) // Parameterized Constructor 
    {
        this.i = x;
        this.j = y;
    }

    public void hello() // Behaviour
    {
        System.out.println("Inside Hello Main");
    }
} // end of Hello class

class Demo
{
    public static void main(String args[])
    {
        Hello hobj1 = new Hello();
        Hello hobj2 = new Hello(11, 21);
        Hello hobj3 = hobj2;

        hobj1.hello();

        System.out.println(hobj1.hashCode());
        System.out.println(hobj2.hashCode());
        System.out.println(hobj3.hashCode());
    }
} // end of Demo class
