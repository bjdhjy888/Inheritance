//Class: for creating objects.
//President is a class.
//See also: https://www.youtube.com/watch?v=FAYcq_5vP8k

package com.company;

public class President {
    public String NameOfPresident;
    //Member variable: Attribute of class President
    //To hold data

    public int HeartRateOfPresident;

    public void Speak(String NameOfPresident){
    //Method: behavior of class President
        if (NameOfPresident == "Trump") {
            System.out.println("Make America Great Again!");
        }
    }
}
