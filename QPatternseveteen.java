import java.util.Scanner;

public class QPatternseveteen {
    static void pattern(int n){
    for (int i = 0; i < n; i++){
        /*space */ for (int j =0; j<n-i-1; j++){
                    System.out.print(" ");
                }
                char ch='A';
                int breakpoint=(2*i+1)/2;
  /*characters */ for(int j=1;j<=2*i+1;j++){
                    System.out.print(ch);
                    if(j<=breakpoint) ch++;
                    else ch--;
                }
                
        /*space */ for (int j =0; j<n-i-1; j++){
                    System.out.print(" ");
                }
               System.out.println();
            }
} public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
}
//     A    
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA