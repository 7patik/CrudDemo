package crud;

import database.Data;
import users.Person;

import java.util.Scanner;

public class Read {
    static Scanner sc=new Scanner(System.in);
    public static void readAll(){
        for (Person p :Data.persons){
            System.out.println(p);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    };
    public static void readById(){
        System.out.print("Axtardığınız Tələbə və ya müəllimin seriya nömrəsini daxil edin: ");
        long inputiseries=sc.nextLong();
        int count=Data.persons.size();
        for (Person p:Data.persons) {
            if (p.getPassportseries() == inputiseries) {
                System.out.println(p);
                count++;
                break;
            } }
        if (count == Data.persons.size()) {
                System.out.println(inputiseries + " Seriyalı tələbə və ya müəllim tapılmadı");

            } else ;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    };
}
