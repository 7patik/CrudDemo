package crud;

import database.Data;
import users.Person;

import java.util.Scanner;

public class Delete {
    static Scanner sc=new Scanner(System.in);
    public static void deleteById(){
        System.out.print("Silmek istediyiniz Tələbə və ya müəllimin seriya nömrəsini daxil edin: ");
        long inputiseries=sc.nextLong();
        int count=Data.persons.size();
        for ( Person p:Data.persons) {
            if (p.getPassportseries()==inputiseries){
                Data.persons.remove(p);
                System.out.println("Silinmə əməliyyatınız uğurla yerinə yetirildi");
                break;
            }}if (count==Data.persons.size()){
                System.out.println(inputiseries+" Seriyalı tələbə və ya müəllim tapılmadı");

            }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    };
}
