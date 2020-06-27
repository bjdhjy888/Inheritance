//Learning Objective: Understanding the concepts of Class and Object - The Core of OOP
//Definition: A class is an extensible program-code-template for creating objects, providing initial values for state (member variables) and implementations of behavior.
//Applications: Objects represent the way programmers would talk and think about the real world problem.
//Purpose: To make programming easier.
//Source Code: https://github.com/bjdhjy888/ClassAndObject/tree/master
//See also: https://www.youtube.com/watch?v=SS-9y0H3Si8

package com.company;

public class Main {

    public static void main(String[] args) {
        President myPresident = new President();
        //Create an object: myPresident - an instance of class President
        //myPresident is like a mini program with its own data and methods, unlike in a C program
        //The new operator initializes and returns a memory address to myPresident,

        myPresident.NameOfPresident = "Trump";
        myPresident.HeartRateOfPresident = 150;

        System.out.print(myPresident.NameOfPresident + " says: ");
        myPresident.Speak(myPresident.NameOfPresident);
        //Calling the method of class President

        Doctor DoctorOfTrump = new Doctor();
        DoctorOfTrump.CheckHealth(myPresident.HeartRateOfPresident); //Objects communicate with each other!

        Surgeon SurgeonOfTrump = new Surgeon();
        SurgeonOfTrump.CheckHealth(myPresident.HeartRateOfPresident);

        SurgeonOfTrump.TransplantHeart(myPresident.HeartRateOfPresident);
    }
}
