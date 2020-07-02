//Learning Objective: Understanding the concept of Inheritance
//Definition: the mechanism of basing an object or class upon another object or class, retaining similar implementation.
//Purpose: Code reuse
//Source Code: https://github.com/bjdhjy888/Inheritance

package com.company;

public class Main {

    public static void main(String[] args) {
        President myPresident = new President();

        myPresident.setNameOfPresident("Trump");    //Calling the method to name the president
        myPresident.setHeartRateOfPresident(150);

        System.out.print(myPresident.NameOfPresident + " says: ");
        myPresident.Speak(myPresident.NameOfPresident);

        Doctor DoctorOfTrump = new Doctor();
        DoctorOfTrump.CheckHealth(myPresident.HeartRateOfPresident);

        Surgeon SurgeonOfTrump = new Surgeon();
        //Class Surgeon inherits Class Doctor
        //SurgeonOfTrump is an object of Class Surgeon

        SurgeonOfTrump.CheckHealth(myPresident.HeartRateOfPresident);   //Calling the method to check the president's health

        SurgeonOfTrump.TransplantHeart(myPresident.HeartRateOfPresident);  //Calling the method to give an operation to the president
    }
}
