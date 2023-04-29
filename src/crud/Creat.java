package crud;

import database.Data;
import users.Student;
import users.Teacher;

import java.util.Scanner;

public class Creat {
    static Scanner sc=new Scanner(System.in);
    public static void creatStudent(){
        System.out.print("Adınızı daxil edin: ");
        String name=sc.nextLine();
        System.out.print("Soyadınızı daxil edin: ");
        String surname=sc.nextLine();
        System.out.print("Yaşınızı daxil edin: ");
        int age=sc.nextInt();
        System.out.print("Seriya nğmrənizi daxil edin: ");
        long passportseries=sc.nextLong();
        sc.nextLine();
        System.out.print("Universitetinizin adını daxil edin: ");
        String university=sc.nextLine();
        System.out.print("Oxuduğunuz ixtisasın adını daxil edin: ");
        String profession=sc.nextLine();
        System.out.print("Neçenci kursda təhsil aldiğınızı daxil edin: ");
        int rank=sc.nextInt();
        sc.nextLine();
        Student s1=new Student(name,surname,age,passportseries,university,profession,rank);
        Data.students.add(s1);
        Data.persons.add(s1);
        System.out.println("-----Tələbə qeydiyyatınız tamamlandı-----");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    };
    public static void creatTeacher(){
        System.out.print("Adınızı daxil edin: ");
        String name=sc.nextLine();
        System.out.print("Soyadınızı daxil edin: ");
        String surname=sc.nextLine();
        System.out.print("Yaşınızı daxil edin: ");
        int age=sc.nextInt();
        System.out.print("Seriya nömrənizi daxil edin: ");
        long passportseries=sc.nextLong();
        sc.nextLine();
        System.out.print("İşlədiyiniz universitetin adını daxil edin: ");
        String university=sc.nextLine();
        System.out.print("Dərs kecdiyiniz sahənin adını daxil edin: ");
        String discipline=sc.nextLine();
        System.out.print("Bu sahede təcrübənizi il kimi daxil edin: ");
        int experience=sc.nextInt();
        sc.nextLine();
        Teacher t1=new Teacher(name,surname,age,passportseries,university,discipline,experience);
        Data.teachers.add(t1);
        Data.persons.add(t1);
        System.out.println("-----Müəllim qeydiyyatınız tamamlandı-----");

    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    };
}
