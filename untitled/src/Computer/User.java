package Computer;

import java.util.Scanner;

public class User {
    public static void main(String[]args){

        //Usarname
        String sys_userName="Komputer";
        String sys_userParol="parol";
        Scanner scan =new Scanner(System.in);
        System.out.println("Username");
        String nameuser=scan.nextLine();
        System.out.println("Parol");
        String userparol=scan.nextLine();

        if(!(sys_userName.equals(nameuser)) && !(sys_userParol.equals(userparol))){
            System.out.println("Username ve parol sehvdir");
        }
        else if ((sys_userName.equals(nameuser)) && !(sys_userParol.equals(userparol))){
            System.out.println("Parol sehvdir");
        }
        else if (!(sys_userName.equals(nameuser)) && (sys_userParol.equals(userparol))){
            System.out.println("Istifadeci adi sehvdir");
        }
        else{
            System.out.println("UGURLAR");
        }

    }
}
