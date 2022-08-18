

// Problem 2
public class Date implements Comparable {
    int month; // Month number in range 1 to 12
    int day; // Day number in range 1 to 31
    int year; // Year Number
    static int hash;
    
    Date(){
    }
    
    Date(int month, int day, int year){
    
        if(month < 1 || month > 12){
            System.out.print("Invalid month");
            System.exit(0);
        }
        else{
            this.month = month;
        }
        
        if(day < 1 || day > 31){
            System.out.print("Invalid day");
            System.exit(0);
        }
        else{
            this.day = day;
        }
        
        this.year = year;
        
        
        
    }
    
    
    
    @Override
    public int compareTo(Object o) {
        Date date = new Date();
        date = (Date)o;
        
        int time2 = date.day * 86400;
        time2 += date.month * 2592000;
        time2 += date.year * 31536000;
        
        int time1 = day * 86400;
        time1 = month * 2592000;
        time1 = year * 31536000;
        
        if(time1 < time2){
            return 0;
        }
        else{
          return 1;  
        } 
    }
    
    @Override
    public String toString(){
        return month + " " + day + ", " + year;
    }
    
  
    
}
