import java.util.Scanner;
public class APatternOne {
public void Pattern(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        APatternOne po=new APatternOne();
        po.Pattern(n);
    }
}
// Output= 5
            
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
            
           
            