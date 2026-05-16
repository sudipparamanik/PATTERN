import java.util.*;
public class Modulo {
    public static void main(String[] args) {
        System.out.print("ENTER YOUR AGE : ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        if(num%2==0){
            System.out.println("YOUR AGE IS EVEN");
        }

        else {
            System.out.println("YOUR AGE IS ODD");
        }
        input.close();
        
    }
    
}
