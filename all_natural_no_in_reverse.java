import java.util.Scanner;

public class all_natural_no_in_reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("starting");
        int s=sc.nextInt();
        System.out.println("ending");
        int e=sc.nextInt();
        // while (s>=e) {
        //     System.out.print(s+" ");
        //     s--;
        // }
        for(int i=s;i<e;i++){
            System.out.print(i+" ");
        }
    } 
}
