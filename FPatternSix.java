import java.util.Scanner;
public class FPatternSix {
public void Pattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FPatternSix PE=new FPatternSix();
        PE.Pattern(n);
    }
}
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1
    

