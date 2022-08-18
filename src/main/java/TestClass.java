//Test class for Date
public class TestClass {
    public static void main (String args[]){
        //Dates to compare
        Date date1 = new Date(8, 13, 2002);
        Date date2 = new Date(7, 14, 2001);
        
        // Returns 0 if Date 1 happend first 
        if(date1.compareTo(date2) == 0){
            System.out.println("date1 happend first");
        }
        // Returns 0 if Date 2 happend first 
        else if(date1.compareTo(date2) == 1){
            System.out.println("date2 happend first");
        }
    
    }
}
