package Computer;

public class forand {
    public static void main(String[]args) {

        int a = 0;
        int j = 1;

        while(a<100){
            j+=2;


            while(j<100){
                System.out.println("a="+ a +"j="+ j);
                j++;
            }
            a+=1;
        }
    }

}