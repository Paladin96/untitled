package Computer;

import java.util.Scanner;

public class Bonkamat {
    public static void main(String[] args) {
        String sys_Name = "Orxan";
        String sys_parol = "azsap555p5";
        Scanner scan = new Scanner(System.in);
        System.out.println("Istifadeci Adi");
        String useradi = scan.nextLine();
        System.out.println("Istifadeci Parolu");
        String userparol = scan.nextLine();

        if(!(sys_Name.equals(useradi))&& !(sys_parol.equals(userparol))){
            System.out.println("Ad ve Parol yanlisdir");
        }
        else if((sys_Name.equals(useradi))&& !(sys_parol.equals(userparol))){
            System.out.println("Parol yanlisdir");
        }
        else if(!(sys_Name.equals(useradi))&& (sys_parol.equals(userparol))){
            System.out.println("Ad yanlisdir");
        }
        else {
            System.out.println("Giris Qebul Olundu");


            int balans = 1900;
            int process;

            System.out.println("1:Sizin Balans ");
            System.out.println("2:Balansa pul elave et");
            System.out.println("3:Balansdan pul cixart");
            System.out.println("4:Sistemden cix");

            process = scan.nextInt();

            switch (process) {
                case 1:
                    System.out.println("Sizin Balans" + balans + "azn");
                    break;
                case 2:
                    System.out.println("Ne qeder pul elave edilecek");
                    int miqdar = scan.nextInt();
                    miqdar += balans;
                    System.out.println("Balans" + miqdar + "azn");
                    if(miqdar>250 ){

                        System.out.println("Balans"+miqdar+"azn");

                    }
                    break;
                case 3:
                    System.out.println("Ne qeder pul cixart");
                    miqdar = scan.nextInt();
                    miqdar -= balans;
                    System.out.println("Balans" + miqdar + "azn");
                    if (miqdar > 1900) {

                        System.out.println("Cixaris ucun kifayet pul yoxdur");
                        break;
                    }
                case 4:
                    System.out.println("Sistemden cixis");
                    break;
                default:
                    System.out.println("Duzgun olmayan melumat");
            }

        }
    }
}