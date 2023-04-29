package crud;

import database.Data;
import users.Person;
import users.Student;
import users.Teacher;

import java.util.Scanner;

public class Update {
    static Scanner sc=new Scanner(System.in);
    public static void updateById(){
        System.out.print("Dəyişiklik etmek istədiyiniz Tələbə və ya müəllimin seriya nömrəsini daxil edin: ");
        long inputiseries=sc.nextLong();
        sc.nextLine();
        int count=Data.persons.size();
        for (Student s:Data.students)for (Teacher t:Data.teachers){
            if (s.getPassportseries()==inputiseries){
                System.out.print("Adınızı daxil edin: ");
                s.setName(sc.nextLine());
                System.out.print("Soyadınızı daxil edin: ");
                s.setSurname(sc.nextLine());
                System.out.print("Yaşınızı daxil edin: ");
                s.setAge(sc.nextInt());
                sc.nextLine();
                System.out.print("Universitetinizin adını daxil edin: ");
                s.setUniversity(sc.nextLine());
                System.out.print("Oxuduğunuz ixtisasın adını daxil edin: ");
                s.setProfession(sc.nextLine());
                System.out.print("Neçənci kursda təhsil aldıgınızı daxil edin: ");
                s.setRank(sc.nextInt());
                sc.nextLine();
                System.out.println(inputiseries+" seriyalı tələbə dəyişikliyi uğurla qeydə alındı");
                count++;
                break;
            }
            else if (t.getPassportseries()==inputiseries){
                System.out.print("Adınızı daxil edin: ");
                t.setName(sc.nextLine());
                System.out.print("Soyadınızı daxil edin: ");
                t.setSurname(sc.nextLine());
                System.out.print("Yaşınızı daxil edin: ");
                t.setAge(sc.nextInt());
                sc.nextLine();
                System.out.print("İşlədiyiniz universitetin adını daxil edin: ");
                t.setUniversity(sc.nextLine());
                System.out.print("Dərs keçdiyiniz sahənin adını daxil edin: ");
                t.setDiscipline(sc.nextLine());
                System.out.print("Bu sahədə təcrübənizi daxil edin: ");
                t.setExperience(sc.nextInt());
                sc.nextLine();
                System.out.println(inputiseries+" seriyalı müəllim dəyişikliyi uğurla qeydə alındı");
                count++;
                break;
            }}
            if (count==Data.persons.size()){
                System.out.println(inputiseries+" seriyalı tələbə və ya müəllim tapilmadı");

            }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    };

}
