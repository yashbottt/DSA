import java.util.Scanner;

public class LPatternTwelve {
       static void pattern(int n){
        int space=2*(n-1);
    for (int i = 1; i<=n; i++){
        /*Numbers */ for (int j =1; j<=i; j++){
                    System.out.print(j);
                }
               
        /*space */ for(int j=1;j<=space;j++){
                    System.out.print(" ");
                }
                
        /*Numbers */ for (int j =i; j>=1; j--){
                    System.out.print(j);
                }
               System.out.println();
               space-=2;
            }
} public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
}
// 1      1
// 12    21
// 123  321
// 12344321