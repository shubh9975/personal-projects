//This is programe to help me resolve my daily jumble puzzle :)
import java.util.*;
public class Jumble {

	public static void main(String[] args) {
		int[] pos1 = new int[2];
		ArrayList<String> perm1=permutation("12");
		SubWord subword1 = new SubWord(pos1, perm1); 

		int[] pos2 = new int[3];
		String[] perm2 = new String[6];
		String subword2 = "ARD";
		permutation("123");
	}

	//Taken from http://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
	public static ArrayList<String> permutation(String str) { 
		ArrayList<String> perms = new ArrayList<String>();
		ArrayList<String> result = permutation("", str, perms); 
		for (int i=0; i<result.size();i++)
		{
			System.out.println(result.get(i));
		}
		return result;
	}

	private static ArrayList<String> permutation(String prefix, String str, ArrayList<String> perms) {
		int n = str.length();
		//if (n == 0) System.out.println(prefix);
		if (n == 0) {
			//System.out.println(prefix);
			perms.add(prefix);
			//return perms;
		}

		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),perms);
		}
		return perms;
		
	}


}
