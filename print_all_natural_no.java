import java.util.Scanner;

public class print_all_natural_no {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("starting");
        int s=sc.nextInt();
        System.out.println("ending");
        int e=sc.nextInt();
        while (s<=e) {
            System.out.print(s+" ");
            s++;
        }
    }   
}
