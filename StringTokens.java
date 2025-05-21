
import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] result = s.trim().split("[ !,?._'@]+");

        if(s.trim().equals("")){
            System.out.println("0");
        } else{
            System.out.println(result.length);
        }

        for(String aresult : result){
            System.out.println(aresult);
        }
    }
}
