import java.io.*;
import java.util.*;
public class abbreviation {
	
    public static String removeConsecutiveDuplicates(String input) {
        if(input.length()<=1)
            return input;
        if(input.charAt(0)==input.charAt(1))
            return removeConsecutiveDuplicates(input.substring(1));
        else
            return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
    }
    public static void main(String[] args)
    {
    	String stat,abbr;
    	Scanner sc=new Scanner(System.in);//taking input
    	
    	stat=sc.nextLine();
    	
    	String [] word=stat.split(" ");
    	
    	int len=word.length;
    	
    	char arr[]=new char[len];
    	
    	for(int i=0;i<len;i++)
    	{
    	System.out.print(word[i].charAt(0));//taking zeroth positon every word 
    		arr[i]=word[i].charAt(0);
    	}
    	abbr=String.valueOf(arr);
       
        System.out.println("\n"+removeConsecutiveDuplicates(abbr));//removing duplicate
    }

}