package Computer;


import java.util.Scanner;

public class Ders{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Cavabi Yazin");
        int note =scan.nextInt();
        if (note>=90){
            System.out.println("Kecdiniz");
        }
        else{
            System.out.println("Kesildiz");
        }
    }



}


