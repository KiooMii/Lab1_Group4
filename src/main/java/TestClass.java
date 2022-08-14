
public class TestClass {
    
    public static void main(String args[]){
        Date date1 = new Date(7, 6, 2002);
        Date date2 = new Date(1, 1, 2024);
    
        if(date1.compareTo(date2) == 0){
        
            System.out.println("date1 happend first");
        }
        else{
            System.out.println("date2 happend first");
        }
    }
}
