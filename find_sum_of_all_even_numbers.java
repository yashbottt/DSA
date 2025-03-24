import java.util.Scanner;

/**
 * find_sum_of_all_even_numbers
 */
public class find_sum_of_all_even_numbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number of Limit : ");
		int Limit=sc.nextInt();
        int sum=0;
        for(int i=1;i<=Limit;i++)
        {
            if(i%2==0)sum=sum+i;
        }
        System.out.println("sum of all even range 1 to "+Limit+" : "+sum);
    }
}