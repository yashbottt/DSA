import java.util.Scanner;

public class BReverseANumber {
    public void  ReverseAnumber(int n){
          int ReverseAnumber=0;
          while(n>0){
            int last_digit = n%10;
            n=n/10;
            ReverseAnumber=(ReverseAnumber*10)+last_digit;
        } 
        System.out.println(ReverseAnumber);  

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=7789;
        int n=sc.nextInt();
        BReverseANumber RaN=new BReverseANumber();
        RaN.ReverseAnumber(n);
} 
}
