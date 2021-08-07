/*
Name: Noorjahan Ferdous
ID: 2012020198
Section: D
Email: cse_2012020198@lus.ac.bd
Date: 07/08/2021
*/
package juhi;


public class Juhi {

    public static void main(String[] args) {
      // write your code here
        Student object1 = new Student();
        Student.universityName = "Leading University";
        Student object2 = new Student(2012020198, "Noorjahan Ferdous");
        Student object3 = new Student("Noorjahan Ferdous",2012020198);
        
        System.out.println(object1.id+" "+object1.name);
        System.out.println(object2.id+" "+object2.name);
        System.out.println(object2.id+" "+object2.name);
        object1.display();
        object2.display();
   
    }
    
}
