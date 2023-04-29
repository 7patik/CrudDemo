import crud.Creat;
import crud.Delete;
import crud.Read;
import crud.Update;
import users.Student;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        boolean run=true;
        while (run){
        System.out.println("Müəllim Şagird sisteminə xoş gəlmisiniz"+"\n"+
                "Təbələ qeydiyyatı üçün-->1"+"\n"+
                "Müəllim qeydiyyatı üçün-->2"+"\n"+
                "Seriya nömrəsi ilə axtarış-->3"+"\n"+
                "Seriya nömrəsi ilə yeniləmə-->4"+"\n"+
                "Seriya nömrəsi ilə silinmə--5"+"\n"+
                "Bütün siyahini çapa vermək-->6"+"\n"+
                "Sistemdən çıxış üçün-->7");
        int secilen=sc.nextInt();
        switch (secilen){
            case 1:
                Creat.creatStudent();
                break;
            case 2:
                Creat.creatTeacher();
                break;
            case 3:
                Read.readById();
                break;
            case 4:
                Update.updateById();
                break;
            case 5:
                Delete.deleteById();
                break;
            case 6:
                Read.readAll();
                break;
            case 7:
                run=false;
                break;
            default:
        }
        }
    }
}