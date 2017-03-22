import java.util.ArrayList;

public class Brillio {

	public static ArrayList <ArrayList<Hurdle>> getallHurdleCombinations(ArrayList<Hurdle> hurdles )
	{
		ArrayList <ArrayList<Hurdle>> hurdleCombinations = new ArrayList <ArrayList<Hurdle>>();
		int hurdleListSize = hurdles.size();
		ArrayList<Hurdle> sizeCombo = new ArrayList<Hurdle>();
		for (int i=1; i<=hurdleListSize;i++ )
		{
			sizeCombo = new ArrayList<Hurdle>();
			for (int j=0; j<=(i+j);j++ )
				sizeCombo.add(hurdles.get(j));
		}
		hurdleCombinations.add(sizeCombo);
		return hurdleCombinations;
	}
	public static void main(String[] args) 
	{
		/*
		ArrayList<Hurdle> hurdles = new ArrayList<Hurdle>();
		hurdles.add(new Hurdle(0, 0, 1));
		hurdles.add(new Hurdle(0, 0, 2));
		hurdles.add(new Hurdle(0, 0, 3));
		hurdles.add(new Hurdle(0, 0, 4));
		ArrayList <ArrayList<Hurdle>> result = getallHurdleCombinations(hurdles);
		*/
		/*
		int n= 6;
		for (int hash=1;hash<=n;hash++)
		{
			for (int i=1;i<=(n-hash);i++)
				System.out.print(" ");
			for (int i=1;i<=hash;i++)
				System.out.print("#");
			System.out.println();
			
		}
		*/
		
		/*
		int [] arr = {1,4,5};
		int sum = 0;
		for (int i=0;i<arr.length;i++)
			sum = sum +=arr[i];
		System.out.println(sum);
		*/
		
		/*
		String input = "apple";
				String output =""+input.charAt(input.length()-1 )+" "+input.charAt(input.length()-2); 
				System.out.println(output);
		
				*/
		
		int[] numbers = {2,1,2,3,3,5};
		ArrayList<String> arl=new ArrayList<String>();
		
		for (int i=0;i<numbers.length;i++)
		{
			int index = i;
			for (int j=0;j<numbers.length;j++)
			{
				if (j!=index && numbers[i]==numbers[j])
				{
					String num = ""+numbers[i];
					if (!arl.contains(num))
							arl.add(num);
				}
			}
			
		}
		System.out.println(arl.size());
			
		
		
	}
}
//Test comment
//One more Test comment
//Yet anothere
