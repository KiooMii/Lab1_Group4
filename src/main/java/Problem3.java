import java.util.*;

public class Problem3{
    static TreeMap<Date, String> syllabus = new TreeMap<>();
    public static void main(String args[]){
        Date date1 = new Date(7, 6, 2002);
        Date date2 = new Date(1, 1, 2024);
        
        for (int day = 1; day <=30; day++) {
            Date date = new Date(9,day,2002); 
            syllabus.put(date, date.toString());
            String info = syllabus.get(date); 
                                           
            if (info != null)
            System.out.println("September " + day + ": " + info);
      }
        
        
    }
    
    
}
