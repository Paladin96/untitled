package Computer;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String sys_userName = "Komputer";
        String sys_userParol = "parol";
        Scanner scan = new Scanner(System.in);
        System.out.println("Username");
        String nameuser = scan.nextLine();
        System.out.println("Parol");
        String userparol = scan.nextLine();

        if (!(sys_userName.equals(nameuser)) && !(sys_userParol.equals(userparol))) {
            System.out.println("Username ve parol sehvdir");
        } else if ((sys_userName.equals(nameuser)) && !(sys_userParol.equals(userparol))) {
            System.out.println("Parol sehvdir");
        } else if (!(sys_userName.equals(nameuser)) && (sys_userParol.equals(userparol))) {
            System.out.println("Istifadeci adi sehvdir");
        } else {
            System.out.println("UGURLAR");


            int wallet = 1000;
            int process;

            System.out.println("1:ShowmyWallet");
            System.out.println("2:DepositmyMoney");
            System.out.println("3:TakemyMoney");
            System.out.println("4:OutofSystem");
            process = scan.nextInt();

            switch (process) {
                case 1:
                    System.out.println("Amountwallet" + wallet + "manat-dir");
                    break;
                case 2:
                    System.out.println("How much money you'll deposit?");
                    int amount = scan.nextInt();
                    wallet += amount;
                    System.out.println("AmountWallet" + wallet + "manat-dir");
                    break;
                case 3:
                    System.out.println("How much mone you'll take?");
                    amount = scan.nextInt();
                    wallet -= amount;
                    System.out.println("AmountWallet" + wallet + "manat-dir");
                    if (amount > 1000) {
                        System.out.println("OverAmount");
                    }

                    break;
                case 4:
                    System.out.println("Loggingout");
                    break;
                default:
                    System.out.println("Unexpectedcondition");


            }


        }
    }
}
