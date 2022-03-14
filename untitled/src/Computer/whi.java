package Computer;

import java.util.Scanner;

public class whi {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scan.nextInt();
        int faktoryal=1;
        while(number>=1){
            System.out.println("Faktoryal"+ faktoryal + "Number"+ number);
            number--;

        }
        System.out.println("Faktoryal"+ faktoryal);



    }
}
