
import java.util.*;
public class Prob {
    public static void main(String[] args) {
        System.out.print(" ENTER NUMBER := ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0 ; i<=n ; i ++){
             sum=sum+i;
        }
        
        System.out.println(sum);
        sc.close();
    }
    
}
