package project1;

import java.util.Random;

public class CipherDecipher {
	
	    /**
	     * This method is used to cipher the message (normal) by following steps.
	     * Swap the cases of String - UpperCase letters to LowerCase letters and viceversa.
	     * Reverse the String
	     * Replace the spaces of string with a star character("*")
	     * Replace the characters in the even positions of the string
	     * Append any integer at the last in that String
	     * 
	     * @param normal
	     * @return the ciphered message
	     */
	    public String ciphering(String normal)
	    {
	    	int WordCountVal=3;
	        int len=normal.length();
	        StringBuffer sb=new StringBuffer();
	        
	        for(int i=0;i<len;i++) 
	        {
	        	char ch=normal.charAt(i);
	        	if(Character.isLowerCase(ch)) {
	        		ch=Character.toUpperCase(ch);
	        	}
	        	else if(Character.isUpperCase(ch)) {
	        		ch=Character.toLowerCase(ch);
	        	}
	        	
	        	sb.append(ch);
	        	
	        }
	        sb.reverse();
	        String str2=sb.toString();
	        
	        String str3=str2.replace(" ","*");
	        char[] ch1=str3.toCharArray();
	        StringBuffer sz=new StringBuffer();
	        for(int j=0;j<ch1.length;j++)
	        {
	        	if(j%2!=0) {
//	        		if(ch1[j]=='*') {
//	        			sz.append(ch1[j]);
//	        		}else {
	        		sz.append((int)ch1[j]);
	        		
	        	}else {
	        		sz.append(ch1[j]);
	        	}
	        	
	        }
	        
	        sz.append(WordCountVal);
	        return sz.toString();
	    }
	    /**
	     * This method is used to get the normal text by the reverse process of ciphering.
	     * 
	     * @param ciphered
	     * @return the deciphered message
	     */
	    public String deciphering(String ciphered){
	    	
	    	StringBuffer sb2=new StringBuffer();
			
	    	String string1=new String(ciphered);
	    	
	    	int val=0;
	    	for(int i=0;i<string1.length();i++)
	    	{
	    		if(Character.isDigit(string1.charAt(i)))
	    		{
	    			val=val*10+(string1.charAt(i)-'0');
	    			if(val>=32&&val<=122)
	    			{
	    				char char1=(char)val;
	    				sb2.append(char1);
	    			}
	    		}else if(Character.isLetter(string1.charAt(i))) {
	    			sb2.append(string1.charAt(i));
	    			val=0;
	    		}else if((32<(int)(string1.charAt(i))||(int)(string1.charAt(i))>65)) {
	    			sb2.append(string1.charAt(i));
	    			val=0;
	    		}
	    	}
	        
	        String st9=sb2.toString();
	    	String st8=st9.replace("*", " ");
	    	String string3=new StringBuffer(st8).reverse().toString();
	        
	        
	        StringBuffer sb4=new StringBuffer();
	        for(int i=0;i<string3.length();i++) 
	        {
	        	char ch=string3.charAt(i);
	        	if(Character.isLowerCase(ch)) {
	        		ch=Character.toUpperCase(ch);
	        	}
	        	else if(Character.isUpperCase(ch)) {
	        		ch=Character.toLowerCase(ch);
	        	}
	        	
	        	sb4.append(ch);
	        	
	        }
	        
	        return sb4.toString();
	    }
	    



}
