import java.util.*;

public class Problem1{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        List<Integer> Integer = new ArrayList<Integer>();
        System.out.println("Enter a series of number to compute for the sum of all the integers. Input '0' to stop");
        
        int num = sc.nextInt();
        while(num != 0){
            Integer.add(num);
            num = sc.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i < Integer.size(); i++){
            sum += Integer.get(i);
        }
        
        System.out.println(sum);
        
    }
    
}
