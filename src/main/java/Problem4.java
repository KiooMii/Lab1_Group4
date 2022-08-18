import java.util.Scanner;


public class Problem4 {
        public static void main(String[] args) { 
        //Scanner Class
        Scanner sc = new Scanner(System.in);
        
        //Asks the user for input
        System.out.println("Input:");
        int n = sc.nextInt();
        
        //Call method square(n)
        square(n);
        }
        
        
        static int square(int n){ 
            
            //Basis
            //Returns 0 when n = 0
            if(n<=0){
                return 0;
            }
            //Computes for the square of current n
            int i = n*n;
            System.out.println("Square root of: " + n + "=" + i);
            
            //Recursive step
            return square(n-1);
        }
    
}