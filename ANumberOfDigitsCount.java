import java.util.Scanner;

class ANumberOfDigitsCount {
    public void  Divisor(int n){
          int count=0;
          while(n>0){
            int last_digit = n%10;
            count=count+1;
            System.out.println(n);
            n=n/10;
        } 
        System.out.println(count);  

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=7789;
        int n=sc.nextInt();
        ANumberOfDigitsCount ad=new ANumberOfDigitsCount();
        ad.Divisor(n);
    }
}
