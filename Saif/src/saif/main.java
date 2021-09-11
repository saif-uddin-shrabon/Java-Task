/*
Name: Saif Uddin Shrabon
Id: 2012020184
Sec: D
Email:cse_2012020184@lus.ac.bd
Date:11/9/2021
 */
package saif;


public class Main {

   
    public static void main(String[] args) {
        Player player=new Player("Sakib",75);
	Cricket cricket=new Cricket("International Match",20,player);
	cricket.display();
	Football football=new Football();
    }
    
}
