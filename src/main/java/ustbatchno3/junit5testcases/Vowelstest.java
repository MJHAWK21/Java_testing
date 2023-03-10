package ustbatchno3.junit5testcases;


public class Vowelstest {

	public static void main(String[] args) {
		
		String str="meera";
		str=str.toLowerCase();
		int len=str.length();
		int i;
		int count=0;
		for(i=0;i<len;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
			
		}
		System.out.println("Number of vowels is:"+count);
	

	}

}
