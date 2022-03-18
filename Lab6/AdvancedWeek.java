
package lab6;

public class AdvancedWeek {
    int index= 1;
       private   String day_1 = "Monday";
       private     String day_2 = "Tuesday";
       private     String day_3 = "Wednesday";
       private     String day_4 = "Thursday";
       private     String day_5 = "Friday";
       private     String day_6 = "Saturday";
       private    String day_7 = "Sunday"; 
       
      public String printDays() {
       return "The advanced days of the week are"+index+ ": "+day_1+",\n"+ ++index+ ": "+day_2+",\n"+ ++index +": "+day_3+",\n"+ ++index+ ": "+day_4+",\n"+ ++index +": "+day_5+",\n"+ ++index+ ": "+day_6+",\n"+ ++index +": "+day_7+".";
    }
}
