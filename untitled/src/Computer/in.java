package Computer;

public class in {
    public static void main(String[]args){
        int i=0;
        while(i<10){
            if(i==4||i==7){
                i++;
                continue;

            }
            System.out.println("i:"+ i);
            i++;


        }
    }
}
