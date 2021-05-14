/*

Description      :  creating a class and object To Get HashCode
Class Name       :  Person
Function Author  :  Prasad Dangare
Input / Output   :  String
Function Date    :  14 May 2021

*/

import java.io.*;

class Person
{
    String name; // properties - variables, characteristics
    int age;

    void Talk() // action - method, behaviour
    {
        System.out.println("Hello Iam " + name);
        System.out.println("My Age is  " + age);
    }
}

class Demo
{
    public static void main(String args[])
    {
        Person Prasad = new Person(); // create Person class object as Prasad
        System.out.println("Hash Code : " + Prasad.hashCode()); // find the hashCode of the object
    }
}