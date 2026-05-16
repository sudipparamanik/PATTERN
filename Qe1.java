import java.util.*;
public class Qe1 {
    public static void main(String args[]){
        System.out.print("Enter your age :");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age>18){
            System.out.println("you are adult");
        }
        else{
            System.out.println("Not adult");
        }
        input.close();
    }
}