import java.util.*;
public class Numbp {
    public static void main (String args []){
        System.out.print("enter your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            // inner loop
            for (int j = 1 ; j <=i ; j++){
             System.out.print(j); 
            }
            //  inner loops is end hear 
            System.out.println();
        }
     sc.close();

    }
}


// number pyramid creat by nested loop :   .............................



