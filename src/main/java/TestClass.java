import java.util.*;
import java.io.*;
public class TestClass {
    static TreeMap<Date, String> syllabus = new TreeMap<>();
    static List<Date> dates = new ArrayList<>();
    public static void main(String args[]){
        Date date1 = new Date(7, 6, 2002);
        Date date2 = new Date(1, 1, 2024);
        Date date = new Date(9, 1, 2002);
        
        for(int i = 1; i<31; i++){
            dates.add(new Date(9, i, 2002));
        }
        
        syllabus.put(dates.get(0), dates.get(0).toString());
        syllabus.put(dates.get(1), dates.get(1).toString());
        
            
         System.out.println(syllabus.size());
         System.out.println(syllabus.values());
         System.out.println(syllabus.keySet());
         System.out.println(dates.size());       
        
    }
    
    public static void putter(int index){
        Date ndate = dates.get(index);
        
        syllabus.put(ndate, ndate.toString());
    }
}
