package JRays;

public class ReverseDigit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123456,r=0;
		while(a!=0)
		{
			int b =a%10;
			r=r*10+b;
			a=a/10;
		}
		System.out.println("The reverse number is: "+r);

	}
}
