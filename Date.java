
import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;


public class Date {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(2023, 9, 14); // Set the desired date
//
//        DayOfWeek dayOfWeek = date.getDayOfWeek();
//
//        System.out.println("Day of the week: " + dayOfWeek);
    	
    	
    	


    	        // Example date in "dd/mm/yyyy" format
    	        String inputDate = "22/11/1995";
    	        
    	        // Define a formatter to parse the input date
    	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	        
    	        // Parse the input date using the formatter
    	        LocalDate date = LocalDate.parse(inputDate, formatter);
    	        
    	        // Get the day of the week
    	        DayOfWeek dayOfWeek = date.getDayOfWeek();
    	        
    	        // Print the day of the week
    	        System.out.println("Day of the week: " + dayOfWeek);
    	

    }
}
