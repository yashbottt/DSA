import java.util.Scanner;

public class find_sum_of_all_odd_numbers {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number of Limit : ");
		int Limit=sc.nextInt();
        int sum=0;
        for(int i=1;i<=Limit;i++)
        {
            if(i%2!=0)sum=sum+i;
        }
        System.out.println("sum of all odd range 1 to "+Limit+" : "+sum);
    }
}
