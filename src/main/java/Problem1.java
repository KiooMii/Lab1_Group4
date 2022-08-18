import java.util.*;

public class Problem1{
    public static void main(String args[]){
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Array List
        List<Integer> Integer = new ArrayList<Integer>();
        //Asks the user to input a series of number. Type 0 to terminate program. 
        System.out.println("Enter a series of number to compute for the sum of all the integers. Input '0' to stop");
        int num = sc.nextInt();
        while(num != 0){
            Integer.add(num);
            num = sc.nextInt();
        }
        //Itterates through the Array List to add all the numbers inside the array list
        int sum = 0;
        for(int i = 0; i < Integer.size(); i++){
            sum += Integer.get(i);
        }
        //Print the sum
        System.out.println(sum);
        
    }
    
}
