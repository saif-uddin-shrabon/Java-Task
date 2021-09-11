/*
Name: Saif Uddin Shrabon
Id: 2012020184
Sec: D
Email:cse_2012020184@lus.ac.bd
Date:11/9/2021
 */
package saif;

public class Cricket extends Sports {
    String matchType ;
    int over;
    Player pm;
    Cricket(String matchType, int over, Player pm){
        this.matchType=matchType;
        this.over=over;
        this.pm=pm;
    }
     void display()
    {
        System.out.println("The match type is : "+matchType);
        System.out.println("Over of the match is : "+over);
        System.out.println("The name of player is : "+pm.playerName
                +" and the jersey number is : "+pm.jerseyNumber);
    }
        
}
