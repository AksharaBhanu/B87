package day12;

public class Demo5 {
//print factorial of given number 5!
	
	
	public static void main(String[] args) {
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}

		System.out.println(fact);
	}

}
