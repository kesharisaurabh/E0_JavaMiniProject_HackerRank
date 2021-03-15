package project3;

public class ChildTwo extends Parent
{
	
	@Override
	public String filter() {
			
		  for(int i = super.startElement; i <= super.endElement; i++){  
	            int result = i;  
	              
	            
	            while(result != 1 && result != 4){  
	                result = isHappyNumber(result);  
	            }  
	              
	            if(result == 1)  
	                System.out.print(i + " ");  
	        }  
		
		return null;
	}
	 public static int isHappyNumber(int num){  
	        int rem = 0, sum = 0;  
	          
	        //Calculates the sum of squares of digits  
	        while(num > 0){  
	            rem = num%10;  
	            sum = sum + (rem*rem);  
	            num = num/10;  
	        }  
	        return sum;  
	    }  
}
