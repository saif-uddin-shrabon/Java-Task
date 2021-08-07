/*
Name: Saif Uddin Shrabon
ID: 2012020184
Section: D
Email: cse_2012020184@lus.ac.bd
Date: 07/08/2021
*/
package shrabon;


public class student {
    String name;
    int id ;
    static String universityName;
    student(){
        student.universityName="Leading University";
    }
    student(int d, String s){
        this.id = d;
        this.name = s;
    }
    student( String s, int d){
        this.id = d;
        this.name = s;
    }

    void display(){
        System.out.println("unuversity Name: " + universityName);
    }
}
