package Computer;

import java.util.Scanner;

public class Connect {
    public static void main(String[]args) {
        //Istifadeci Adi
        String sys_user_name = "Toshiba";
        String parol = "1234abc321";
        Scanner scan = new Scanner(System.in);
        System.out.println("Istifadeci Adi");
        String istifadec_adi = scan.nextLine();
        System.out.println("Parol");
        String user_parol = scan.nextLine();
        if (!(sys_user_name.equals(istifadec_adi)) && !(parol.equals(user_parol))) {

            System.out.println("Istifadeci Adi ve Parol yanlisdir");
        } else if ((sys_user_name.equals(istifadec_adi)) && !(parol.equals(user_parol))) {
            System.out.println("Parol Sehvdir");
        } else if (!(sys_user_name.equals(istifadec_adi)) && (parol.equals(user_parol))) {
            System.out.println("Istifadeci Adi Sehvdir");
        } else {
            System.out.println("Girildi");
        }
    }
}

