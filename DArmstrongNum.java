import java.util.Scanner;

public class DArmstrongNum {
      public void  armstrong(int n){
          int ReverseAnumber=0;
          int duplicate=n;
          int Sum=0;
          int k = String.valueOf(n).length();

          while(n>0){
            int last_digit = n%10;
            Sum += Math.pow(last_digit, k); 

            n=n/10;
            ReverseAnumber=(ReverseAnumber*10)+last_digit;
        } 
          if(duplicate==Sum) System.out.println("true");
          else System.out.println("false");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        DArmstrongNum da=new DArmstrongNum();
        da.armstrong(n);
    }
}
