import java.util.*;
import java.io.*;
public class TestClass {
    static TreeMap<Date, String> syllabus = new TreeMap<>();
    static List<Date> dates = new ArrayList<>();
    public static void main(String args[]){
        Date date1 = new Date(7, 6, 2002);
        Date date2 = new Date(1, 1, 2024);
        Date date = new Date();
        
        
         for(int i = 0; i < 30; i++){
             dates.add(new Date(9, i+1, 2002)); 
        }
         
         Date[] adate = new Date[dates.size()];
         adate = dates.toArray(adate);
         
         for(int i = 0; i < 30; i++){
             syllabus.put(adate[i], adate[i].toString());
             adate.hashCode();
         }
         
    
         
//         for(Date x : adate){
//         System.out.print(x);
//         }
         
//            syllabus.put(date1, date1.toString());
//            syllabus.put(date2, date2.toString());
         
         System.out.println(syllabus.size());
         System.out.println(syllabus.keySet());
         System.out.println(dates.size());       
        
    }
    
    public static void putter(int index){
        Date ndate = dates.get(index);
        
        syllabus.put(ndate, ndate.toString());
    }
}
