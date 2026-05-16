import java.util.*;;

public class Button {
    public static void main (String args[]){
        System.out.print("ENTER A BUTTON : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1: System.out.println("hello");
            break;
            case 2 : System.out.println("namaste");
            break;
            case 3 : System.out.println("thankyou");
            break;
                
            
        
            default: System.out.println("YOU ARE ENTER A WRONG BUTTON ........");

                break;
        }
sc.close();
    }

    
}


