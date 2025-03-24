import java.util.Scanner;

public class SPatternNinteen {
    static void pattern(int N){
        int iniS = 0;
        for(int i=0;i< N;i++){
      //star
            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }
     //space       
            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }
     //star       
            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }
            iniS+=2;
            System.out.println();
        }
        iniS = 2*N -2;
        for(int i=1;i<=N;i++){
      //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
    //space
            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }
      //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
                iniS-=2;
            System.out.println();
        } 
} public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        pattern(N);
    }
}

// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********