import java.util.Scanner;

public class GPatternSeven {
   static void pattern(int n){
    for (int i = 0; i < n; i++){
        /*space */ for (int j =0; j<n-i-1; j++){
                    System.out.print("   ");
                }
               
        /*star */ for(int j=0;j< 2*i+1;j++){
                    System.out.print(" * ");
                }
                
        /*space */ for (int j =0; j<n-i-1; j++){
                    System.out.print("   ");
                }
               System.out.println();
            }
} public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
}
//             *
//          *  *  *
//       *  *  *  *  *
//    *  *  *  *  *  *  *
// *  *  *  *  *  *  *  *  *