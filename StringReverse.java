
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        StringBuffer sb = new StringBuffer(A);

        sb.reverse();
        if(sb.toString().equals(A)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
