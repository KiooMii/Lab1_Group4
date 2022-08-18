import java.util.*;

public class Problem3{
    static TreeMap<Date, String> syllabus = new TreeMap<>();
    public static void main(String args[]){
        
        //For loop to instantiate through numbers 1 - 30. Days 1-30
        for (int day = 1; day <=30; day++) {
            //Creates a new instance date, with int day as second parameter
            Date date = new Date(9,day,2002); 
            //Puts date as key in syllabus. date.tostring as value in syllabus
            syllabus.put(date, date.toString());
            
            //gets value of key "date" in the syllabus
            String info = syllabus.get(date); 
             
            //Prints syllabus
            if (info != null)
            System.out.println("September " + day + ": " + info);
      }  
    }
    
    
}
