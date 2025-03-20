import java.util.Scanner;

public class CPalindrome {

    public void  palindrome(int n){
          int ReverseAnumber=0;
          int duplicate=n;
          while(n>0){
            int last_digit = n%10;
            n=n/10;
            ReverseAnumber=(ReverseAnumber*10)+last_digit;
        } 
          if(duplicate==ReverseAnumber) System.out.println("true");
          else System.out.println("false");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        CPalindrome p=new CPalindrome();
        p.palindrome(n);
    }
}