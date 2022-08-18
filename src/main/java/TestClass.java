import java.util.*;
import java.io.*;
public class TestClass extends Date{
    static TreeMap<Date, String> syllabus = new TreeMap<>();
    static List<Date> dates = new ArrayList<>();
    public static void main(String args[]){
        Date date1 = new Date(7, 6, 2002);
        Date date2 = new Date(1, 1, 2024);
        
        
        
        for (int day = 1; day <=30; day++) {
           
         Date date = new Date(9,day,2002); // The key.
         syllabus.put(date, date.toString());
         Object info = syllabus.get(date); // Get the value for that key.
                                           // (Can be null.)
         if (info != null)
            System.out.println("September " + day + ": " + info);
      }
        
          
//        int j = 0;
//        for(int i = 1; i<31; i++){
//            dates.add(new Date(9, i, 2002));
//            syllabus.put(dates.get(j), dates.get(0).toString());
//            j++;
//        }
        
//        syllabus.put(new Date(dates.get(j).month, dates.get(j).day, dates.get(j).year), dates.get(0).toString());
//        syllabus.put(dates.get(1), dates.get(1).toString());
        
            
         System.out.println(syllabus.size());
//         System.out.println(syllabus.values());
//         System.out.println(syllabus.keySet());
//         System.out.println(dates.size());  
//         System.out.println(dates.toString());  
        
    }
    
    public static void putter(int index){
        Date ndate = dates.get(index);
        
        syllabus.put(ndate, ndate.toString());
    }
}
