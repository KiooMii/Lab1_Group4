import java.util.Scanner;


public class Problem4 {
        public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int n = sc.nextInt();
        square(n);
        }
        static int square(int n){ 
            if(n<=0){
                return 0;
            }
        int i = n*n;
        System.out.println("Square root of: " + n + "=" + i);
        return square(n-1);
        }
    
}