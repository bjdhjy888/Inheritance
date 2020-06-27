//Class Surgeon is a sub-level of Class Doctor
//Class Surgeon has the fields(member variables) and methods of class Doctor
//Class Doctor is more generic, whereas class Surgeon is more specific
//Class Surgeon's fields and methods are different from those of class Doctor
//Class Surgeon has its own fields and methods
//To rid repeated codes, to better maintain software with min. changes to codes
//Codes are not repeated in class Surgeon; Codes reused but not repetitively written

package com.company;

public class Surgeon extends Doctor{
    public void TransplantHeart(int HeartRateOfPresident){
        if(HeartRateOfPresident > 140){
            System.out.println("Let me give you a new heart.");
        }
    }
}


