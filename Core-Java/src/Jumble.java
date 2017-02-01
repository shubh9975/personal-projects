//This is programe to help me resolve my daily jumble puzzle :)
import java.util.*;
public class Jumble {

	public static void main(String[] args) {
		char[] s = {'1','2','3','4','5','6'} ;
		//char[] s = new char[6] ;
		System.out.println(s);
		TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
		tm.put(1, "Chaitanya");
	    tm.put(1, "Ajeet");
	    tm.put(11, "Test");
	    
	    Set set = tm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	        Map.Entry me = (Map.Entry)i.next();
	        System.out.print(me.getKey() + ": ");
	        System.out.println(me.getValue());
	      }
		

	}
	
	public static void makeWord(HashMap permutation ){
		TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
		Set set = permutation.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	        Map.Entry me = (Map.Entry)i.next();
	        tm.put(Integer.parseInt(me.getKey().toString()),(me.getValue()).toString());
	      }
	}
	

}
