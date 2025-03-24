import java.util.Scanner;

public class table_of_two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // System.out.println("enter the table no");    
        // int n=sc.nextInt();
        // for(int i=1;i<=10;i++){
        // int table=n*i;
        // System.out.print(n+" X "+i+" = ");
        // System.out.println(table);        
        // }
        System.out.println("enter the table no");    
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=x;i>=y;i--){
        int table=n*i;
        System.out.print(n+" X "+i+" = ");
        System.out.println(table);        
        }
    }
}

