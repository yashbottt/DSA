import java.util.Scanner;

public class Ppatternsixteen {
     static void Pattern(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)((int)('A'+i)) + " ");            
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern(n);
    }
}
// A 
// B B 
// C C C 
// D D D D 
// E E E E E 