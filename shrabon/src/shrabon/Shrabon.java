/*
Name: Saif Uddin Shrabon
ID: 2012020184
Section: D
Email: cse_2012020184@lus.ac.bd
Date: 07/08/2021
*/
package shrabon;


public class Shrabon {

    public static void main(String[] args) {
         student Student1 = new student();
        student Student2 = new student(2012020184, "Saif");
        student Student3 = new student("Saif",2012020184);
        student.universityName = "Leading University";
        System.out.println(Student1.id+" "+Student1.name);
        System.out.println(Student2.id+" "+Student2.name);
        System.out.println(Student2.id+" "+Student2.name);
        Student1.display();
      
    }
      boolean eta_bola_tik_hoyni = false;
    
}
