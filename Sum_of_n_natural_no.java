import java.util.Scanner;

/**
 * Sum_of_n_natural_no
 */
public class Sum_of_n_natural_no {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("starting");
        int s=sc.nextInt();
        System.out.println("ending");
        int e=sc.nextInt();
        
        int sum=0;
        for(int i=s;i<=e;i++){
            sum=sum+i;
    
        }
        System.out.println(sum);

    }
}