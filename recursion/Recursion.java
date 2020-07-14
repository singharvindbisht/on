package recursion;

public class Recursion {
	static float cnt = 0;
	
	static float power(float a, float b)
	{
		cnt++;
		System.out.println(b);
		if(b==0)	return 1;
		else if(b%3 == 0) return power(a*a*a, b/3);
		else
			return a*power(a, b-1);
	}
	
	public static void main(String[] args)
	{
		//cnt = 0;
		System.out.println(power(3, 50));
		System.out.println(cnt);
	}
}
//  -742892767    5.153775207320114E47