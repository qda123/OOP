package Lab01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class DisplayTheNumberOfDaysOfTheMonth {
	    public static boolean CheckLeapYear(int year){
	        boolean check;
	        if (year % 4 == 0){
	            if (year % 100 == 0){
	                if (year % 400 == 0){
	                	check = true;
	                }
	                else{
	                	check = false;
	                }
	            }
	            else{
	            	check = true;
	            }
	        }
	        else{
	        	check = false;
	        }
	        return check;
	    }


	    public static void main(String[] args){
	        boolean check;
	        
	        String[] Days_31 = new String[]{"January", "Jan", "Jan.", "1",
	                                        "March", "Mar", "Mar.", "3",
	                                        "May", "5",
	                                        "July", "Jul", "7",
	                                        "August", "Aug", "Aug.", "8",
	                                        "October", "Oct", "Oct.", "10",
	                                        "December", "Dec.", "Dec", "12"};

	        String[] Days_30 = new String[]{"April", "Apr", "Apr.", "4",
	                                        "June", "Jun", "6",
	                                        "September", "Sept.", "Sep",
	                                        "November", "Nov.", "Nov", "11"};

	        String[] Days_29 = new String[]{"February", "Feb.", "Feb", "2"};

	        List<String> List31 = Arrays.asList(Days_31);
	        List<String> List30 = Arrays.asList(Days_30);
	        List<String> List29 = Arrays.asList(Days_29);
	        
	        String month;
	        int year;
	        Scanner keyboard;

	        do {
	            keyboard = new Scanner(System.in);
	            System.out.println("Enter month: ");
	            month = keyboard.nextLine();
	            System.out.println("Enter year: ");
	            year = keyboard.nextInt();
	            
	        } while(year < 0 || (!(List29.contains(month)) 
	        		&& !(List30.contains(month)) && !(List31.contains(month))));

	        check = CheckLeapYear(year);

	        if (List31.contains(month)){
	            System.out.println("Number of days in month: 31");
	        } 
	        else if (List30.contains(month)){
	            System.out.println("Number of days in month: 30");
	        }
	        else if(List29.contains(month)){
	            if (check){
	                System.out.println("Number of days in month: 29");
	            }
	            else{
	                System.out.println("Number of days in month: 28");
	            }
	        }
	        keyboard.close();
	    }
}