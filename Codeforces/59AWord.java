import java.util.*;
import java.io.*;
 
 
public class Solution{
      public static final void main(String[] args){
          
          
          Scanner in = new Scanner(System.in);
          String input = in.nextLine();
          
          int len = input.length();
          int count = 0;
          
          for(int i = 0; i < len; i++){
             if(Character.isUpperCase(input.charAt(i))){
    				count++;
    		}
          }
          
          	if(count > (len/2))
    		System.out.println(input.toUpperCase());
    	    else
    		System.out.println(input.toLowerCase());
      } 
}