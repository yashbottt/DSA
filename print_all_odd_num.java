import java.util.Scanner;

public class print_all_odd_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number of Limit : ");
		int Limit=sc.nextInt();
        for(int i=1;i<=Limit;i++)
        {
            if(i%2!=0)System.out.print(i+" ");
        }
    }
}
