
package juhi;

public class Student {
    String name;
    int id ;
    static String universityName;
    Student(){
        Student.universityName="Leading University";
    }
    Student(int n, String s){
        this.id = n;
        this.name = s;
    }
    Student( String s, int n){
        this.id = n;
        this.name = s;
    }

    void display(){
        System.out.println("unuversity Name: " + universityName);
    }
}
