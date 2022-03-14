package Computer;

import java.util.Scanner;

public class ders {
    public static void main(String[]args){

        while(true){
            Scanner scan=new Scanner(System.in);
            String s;
            System.out.println("Karekter Gir");
            s =scan.nextLine();
            if(s.equals("q")){
                System.out.println("Exiting");
                break;
            }
            System.out.println("Karakter"+ s);
        }
    }
}
