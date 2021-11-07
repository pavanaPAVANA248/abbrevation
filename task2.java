import java.util.*;
import java.util.Arrays;
import java.util.List;
public class SortFormat {
	 public static String m(String arr){
	        arr=" "+arr;
	            String k="";
	            List<Character> al=new ArrayList<>();
	            char []chr=arr.toCharArray();
	        for(int i=0;i<chr.length;i++)
	            if(Character.isSpace(chr[i]))
	                al.add(chr[i+1]);
	            for(int i=0;i<al.size();i++)
	                if(al.get(i)==al.get(i+1))
	                    al.remove(i+1);
	            for(char c :al)
	                k+=(Character)c;
	        return k;
	    }
	    public static void main(String args[]) {
	     

	      System.out.println(m("Geeks For Geek Good"));
	    }

}
