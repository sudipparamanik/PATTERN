public class Roted {
    public static void main(String[] args) {
        // outer loops 
        int n = 4;
        for (int i = 1 ; i<=n; i++){
            // inner loops space print
            for (int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            // 2nd inner loops for print the stars :
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();


        }
    }
}

