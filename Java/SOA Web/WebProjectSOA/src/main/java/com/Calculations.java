package com;

public class Calculations {
	public int calDays(int month ,int year,int day)
	{
		
	
		 
        int numDays = 0;
        int calday=0;
        
        int value1 =30;
        int value2 =31;
        
        
                    if (((year % 4 == 0) && 
	                     !(year % 100 == 0))
	                     || (year % 400 == 0))
	                    numDays = 29 ;
	                else
	                    numDays = 28 ;
	               

	        switch (month) {
	            case 1: 
	                calday=day;
	                break;
	            case 2: 
	                  calday=day + value2;
	                break;
	            case 3: 
	                  calday=day + numDays + value2;
	                break;
	            case 4:
	                  calday=day +numDays + (value2 *2)  ;
	                break;
	            case 5: 
	       	          calday=day +numDays + (value2 *2) + value1 ;
	                break;
	            case 6: 
	                  calday=day +numDays + (value2 *2) + (value1*2) ;
	                break;
	           case 7:
	      	     calday=day +numDays + (value2 *3) + (value1*2) ;           
	                break;
	            case 8:
	            calday=day +numDays + (value2 *4) + (value1*2)  ; 
	               break;
	              case 9: 
	       	          calday=day +numDays + (value2 *4) + (value1*3)  ;
	                break;
	            case 10: 
	                  calday=day +numDays + (value2 *5) + (value1*3)  ;
	                break;
	           case 11:
	      	     calday=day +numDays + (value2 *6) + (value1 * 3)  ;           
	                break;
	            case 12:
	            calday=day +numDays + (value2 *6) + (value1*4)  ; 
	               break;
	                
	            default:
	                System.out.println("Invalid month.");
	                break;
	        
	   
	}
	        
	          return calday;
}
}
