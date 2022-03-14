package Computer;


import java.util.Scanner;

public class whilea {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scan.nextInt();
        int faktoryal=1;
        while(number>=1){
            faktoryal=faktoryal*number;
            System.out.println("Faktoryal"+ faktoryal + "Number"+ number);


            number--;


        }
        System.out.println("Faktoryal"+ faktoryal);


    }

}
