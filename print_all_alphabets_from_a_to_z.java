import java.util.Scanner;

/**
 * print_all_alphabets_from_a_to_z
 */
public class print_all_alphabets_from_a_to_z {

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // char ch=sc.next().charAt(0);
        //a to z 
        // for(char i='a';i<='z';i++){
        //     System.out.print(i+" ");
        // }    a to z  reverse
        // for(char i='z';i>='a';i--){
        //     System.out.print(i+" ");
        // }
        char i='z';
        while (i>='a') {
            char print=i;
            System.out.print(print+" ");
            i--;
        }
    }
}