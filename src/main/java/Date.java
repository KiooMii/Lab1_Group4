

// Problem 2
public class Date implements Comparable {
    int month; // Month number in range 1 to 12
    int day; // Day number in range 1 to 31
    int year; // Year Number
   
    
    Date(){
    }
    //Constructor
    Date(int month, int day, int year){
        //Sets the value for the instance variable
        //Case for when month is less than 1 or greater 12
        if(month < 1 || month > 12){
            System.out.print("Invalid month");
            System.exit(0);
        }
        //Sets the value of month
        else{
            this.month = month;
        }
        
        //Case for when day is less than 1 or greater than 30 
        if(day < 1 || day > 31){
            System.out.print("Invalid day");
            System.exit(0);
        }
        //Sets the value of day
        else{
            this.day = day;
        }
        
        this.year = year;
        
        
        
    }
    
    
    
    @Override
    public int compareTo(Object o) {
        //Creates a new instance of Date, for Object to be casted as Date
        Date date = new Date();
        date = (Date)o;
        
        //Computes which date came first, by comparing the amount of second each Date has, and comparing them
        int time2 = date.day * 86400;
        time2 += date.month * 2592000;
        time2 += date.year * 31536000;
        
        int time1 = day * 86400;
        time1 = month * 2592000;
        time1 = year * 31536000;
        
        //return 0 if time 1 happend first
        if(time1 < time2){
            return 0;
        }
        //return 1 if time 2 happend first
        else{
          return 1;  
        } 
    }
    
    //Is called whenever Date class is called
    @Override
    public String toString(){
        return month + " " + day + ", " + year;
    }
    
  
    
}
